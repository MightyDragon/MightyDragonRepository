package fuser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import src.model.Pkmn;
import japa.parser.*;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.ImportDeclaration;
import japa.parser.ast.TypeParameter;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.Parameter;
import japa.parser.ast.body.TypeDeclaration;
import japa.parser.ast.expr.Expression;
import japa.parser.ast.expr.MethodCallExpr;
import japa.parser.ast.stmt.BlockStmt;
import japa.parser.ast.stmt.Statement;
import japa.parser.ast.visitor.GenericVisitorAdapter;
import japa.parser.ast.visitor.VoidVisitorAdapter;

public class MethodLinkParser {


	private MethodLinkParser() {
		// hide constructor
	}

	/**
	 * 
	 * @param in - the InputStream representing the Java file to be parsed
	 * @param packageMethods - a list of methods (as Methods) found within the entire package and that could be called from
	 * the class being parsed
	 * 
	 * 
	 * @return links - a list of method links represented by pairs of Method objects (pairs are lists with two elements)
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public static ArrayList<ArrayList<Method>> generateMethodLinks(InputStream in, List<Method> packageMethods) throws ParseException, IOException {
		// TODO: stub
		ArrayList<ArrayList<Method>> links = new ArrayList<ArrayList<Method>>();

		CompilationUnit cu;
//		try {
			// try parsing the file
//			cu = JavaParser.parse(in);
//		} catch (ParseException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("ERROR -- parse failed on " + in.toString());
//		} finally {
//			try {
//				in.close();
////			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				System.out.println("ERROR -- parse failed on " + in.toString());
//			}
//		}
		
		cu = JavaParser.parse(in);
		in.close();
		
		
		// visit and analyse the methods to get links
		links = (ArrayList<ArrayList<Method>>) new MethodVisitor().visit(cu, packageMethods);
		
//		Method[] meths = Pkmn.class.getDeclaredMethods();
//		for (Method m : meths) {
//			System.out.println(m.toGenericString());
//		 // sample output: public void src.model.Pkmn.setMoveset(src.model.Move,src.model.Move)
//		}
		
		return links;
	}


	/**
	 * Simple visitor implementation for visiting MethodDeclaration nodes. 
	 */
	private static class MethodVisitor extends GenericVisitorAdapter {
		
		ArrayList<ArrayList<Method>> links = new ArrayList<ArrayList<Method>>();
		
		public Object visit(CompilationUnit n, Object arg) {
	        if (n.getPackage() != null) {
	            n.getPackage().accept(this, arg);
	        }
	        if (n.getImports() != null) {
	            for (ImportDeclaration i : n.getImports()) {
	                i.accept(this, arg);
	            }
	        }
	        if (n.getTypes() != null) {
	            for (TypeDeclaration typeDeclaration : n.getTypes()) {
	                typeDeclaration.accept(this, arg);
	            }
	        }
	        return links;
	    }

		@SuppressWarnings("unchecked")
		@Override
		public Object visit(MethodDeclaration n, Object arg) {
			// here you can access the attributes of the method.
			// this method will be called for all methods in this 
			// CompilationUnit, including inner class methods
			
//			ArrayList<ArrayList<Method>> links = new ArrayList<ArrayList<Method>>();
			if (!arg.getClass().equals(new ArrayList<Method>().getClass())) {
				System.out.println("ERROR - MethodVisitor expects ArrayList<Method> as arg, now returning empty list");
				return null;
			}
			
			String name = n.getName();
			List<Parameter> params = n.getParameters();
			int size = 0;
			if (params != null) {size = params.size();}
			System.out.println(name + " [" + size + " parameter(s)]");
			
			ArrayList<Method> allMethods = (ArrayList<Method>) arg;
			int methodIndex = 0;
			while (methodIndex < allMethods.size()) {
				Method meth = allMethods.get(methodIndex);
				String methName = meth.getName();
				int paramCount = meth.getParameterTypes().length;
				if (methName.equals(name) && paramCount == size) {
					break;
				} else {
					methodIndex++;
				}
			}
			if (methodIndex == allMethods.size()) {
				System.out.println("No match found for Method " + name + " [" + size + " parameter(s)]");
				return null;
			}
			
			List<Method> linkedMethods = new ArrayList<Method>();
			linkedMethods = (ArrayList<Method>) new MethodCallExprVisitor().visit(n.getBody(), allMethods);
			if (linkedMethods == null || linkedMethods.isEmpty()) {
				System.out.println("No links found in " + name + "\n");
				return null;
			}
			
			System.out.println("Links found: " + linkedMethods.toString() + "\n");
			
			for (Method m : linkedMethods) {
				ArrayList<Method> pair = new ArrayList<Method>(2);
				pair.add(allMethods.get(methodIndex));
				pair.add(m);
				links.add(pair);
			}
			
			return null;
			
		}
	}
	
	/**
	 * Simple visitor implementation for visiting MethodCallExpression nodes. 
	 */
	private static class MethodCallExprVisitor extends GenericVisitorAdapter {
		
		ArrayList<Method> calls = new ArrayList<Method>();
		
		@SuppressWarnings("unchecked")
		@Override
		public Object visit(BlockStmt n, Object arg) {
			if (n.getStmts() != null) {
				for (Statement s : n.getStmts()) {
					s.accept(this, arg);
				}
			}
			return calls;
		}
		
		@Override
		public Object visit(MethodCallExpr n, Object arg) {
			if (!arg.getClass().equals(new ArrayList<Method>().getClass())) {
				System.out.println("ERROR - MethodCallExprVisitor expects ArrayList<Method> as arg, now returning empty list");
				return null;
			}
			
			String name = n.getName();
			List<Expression> args = n.getArgs();
			int size = 0;
			if (args != null) {size = args.size();}
			System.out.println("\t" + name + " [" + size + " parameter(s)]");
			
			@SuppressWarnings("unchecked")
			ArrayList<Method> allMethods = (ArrayList<Method>) arg;
			int methodIndex = 0;
			while (methodIndex < allMethods.size()) {
				Method meth = allMethods.get(methodIndex);
				String methName = meth.getName();
				int paramCount = meth.getParameterTypes().length;
				if (methName.equals(name) && paramCount == size) {
					break;
				} else {
					methodIndex++;
				}
			}
			if (methodIndex == allMethods.size()) {
				return null;
			}
			
			calls.add(allMethods.get(methodIndex));
			
			return null;
		}
		
	}

}
