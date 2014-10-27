package org.arpit.java2blog;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.reflections.Reflections;

import static org.reflections.ReflectionUtils.*;
import src.simulator.Client;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;

//import java.util.HashSet;
//
//import org.eclipse.jdt.core.IJavaElement;
//import org.eclipse.jdt.core.IMember;
//import org.eclipse.jdt.core.IMethod;
//import org.eclipse.jdt.internal.corext.callhierarchy.CallHierarchy;
//import org.eclipse.jdt.internal.corext.callhierarchy.MethodWrapper;
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.NullProgressMonitor;
//import org.eclipse.core.runtime.Path;

import java.util.Set;
import java.io.StringWriter; 
import java.io.PrintWriter;


public class StartFile {

	public static void main(String args[]){
		System.out.println("And thus, we begin... ");


		
		PokemonClassCollector objects = new PokemonClassCollector();
		ArrayList<Class> classList = objects.getClasses();
		
//		Client pokemon = new Client();
		ClientRun pkmnClient = new ClientRun();
		Thread t = new Thread(pkmnClient);
		t.start();
		
		// get the stackTrace continuously
		/* TODO: need to figure out how to use StackTraceElement objects to get proper
		 * Method objects so they can be used by the visualiser
		 */		 
		while (t.isAlive()) {
			//System.out.println("Current stack trace:");
			StackTraceElement[] trace = t.getStackTrace();
			ArrayList<String[]> methodPairs = new ArrayList<String[]>();

			
			int stackNumber = trace.length;
			
			for(int i=0; i<stackNumber-2 ;i++) {
				String[] firstO = {trace[i].getMethodName(), trace[i+1].getMethodName()};
				methodPairs.add(firstO);
				}
			
			ArrayList<Object[]> methodList = getMethodNames(classList);

			createJSONMethods(methodList);

			createJSONLinks(methodPairs, methodList);

//				StringWriter sw = new StringWriter();
//				new Throwable().printStackTrace(new PrintWriter(sw));
//				System.out.println("Current stack trace is:\n\t");
				
		Client pokemon = new Client();
		}
	}
	
	public static JSONObject createJSONMethods(ArrayList<Object[]> classList){
		JSONObject allMethods = new JSONObject();
		JSONArray listMethods = new JSONArray();
		
		for (Object[] m : classList){
			JSONObject meth = new JSONObject();
			Method methodz = (Method)m[0];
			Class classz = (Class)m[1];
			meth.put("name", methodz.getName());
			meth.put("group", classz.getName());
			
			listMethods.add(meth);
		}
		allMethods.put("nodes", listMethods);
		
		//System.out.println(allMethods);
		return allMethods;
	}
	
	public static ArrayList<Object[]> getMethodNames(ArrayList<Class> classes){
		ArrayList<Object[]> pairs = new ArrayList<Object[]>();
		int currentNumber=0;
		for (Class c : classes){
			Method[] cMethods = c.getDeclaredMethods();
			for (Method m : cMethods){
				Object[] p = {m, c,currentNumber};
				pairs.add(p);
				currentNumber++;
			}
		}
//		StringWriter sw = new StringWriter();
//		new Throwable().printStackTrace(new PrintWriter(sw));
//		System.out.println("Current stack trace is:\n\t" + sw.toString());
//		return pairs;
		return pairs;
	}
	
//
//	public static ArrayList<Method> getMethods(ArrayList<Class> classes){
//		ArrayList<Method> methods = new ArrayList<Method>();
//		for (Class c : classes){
//			Method[] cMethods = c.getDeclaredMethods();
//			for (Method m : cMethods){
//				methods.add(m);
//				
//			}
//		}
//		return methods;
//	}
	
//	public HashSet<IMethod> getCallersOf(IMethod m) {
//		 
//		 CallHierarchy callHierarchy = CallHierarchy.getDefault();
//		 
//		 IMember[] members = {m};
//		 
//		 MethodWrapper[] methodWrappers = callHierarchy.getCallerRoots(members);
//		  HashSet<IMethod> callers = new HashSet<IMethod>();
//		  for (MethodWrapper mw : methodWrappers) {
//		    MethodWrapper[] mw2 = mw.getCalls(new NullProgressMonitor());
//		    HashSet<IMethod> temp = getIMethods(mw2);
//		    callers.addAll(temp); 
//		    for (IMethod im: callers){
//		    System.out.println(im);
//		    }
//		   }
//		
//		return callers;
//		
//		}
//		 
//		 HashSet<IMethod> getIMethods(MethodWrapper[] methodWrappers) {
//		  HashSet<IMethod> c = new HashSet<IMethod>(); 
//		  for (MethodWrapper m : methodWrappers) {
//		   IMethod im = getIMethodFromMethodWrapper(m);
//		   if (im != null) {
//		    c.add(im);
//		   }
//		  }
//		  return c;
//		 }
//		 
//		 
//		 
//		 IMethod getIMethodFromMethodWrapper(MethodWrapper m) {
//		  try {
//		   IMember im = m.getMember();
//		   if (im.getElementType() == IJavaElement.METHOD) {
//		    return (IMethod)m.getMember();
//		   }
//		  } catch (Exception e) {
//		   e.printStackTrace();
//		  }
//		  return null;
//		 } 
	
//	public static ArrayList<Object[]> getLinks(ArrayList<Object[]> methods){
//		ArrayList<Object[]> links = new ArrayList<Object[]>();
//			for (Object[] m : methods){
//				Object[] mlinks = 
//			}
//		}
		


	
	


	public static JSONObject createJSONLinks(ArrayList<String[]> stackMethods, ArrayList<Object[]> allMethods){
		JSONObject allLinks = new JSONObject();
		JSONArray listLinks = new JSONArray();
		
		for (String[] pair : stackMethods){
			JSONObject link = new JSONObject();
			boolean first = false;
			boolean second = false;
			for (Object[] currentMethod : allMethods){

				
				if(pair[0].equals(((Method) currentMethod[0]).getName())){

					link.put("source", currentMethod[2]);
					first = true;

				}
				
				if(pair[1].equals(((Method) currentMethod[0]).getName())){

					link.put("target", currentMethod[2]);
					second = true;
				}

			}
			link.put("value", 1);
			
			if(first && second){
				listLinks.add(link);
			}
		}
		
		allLinks.put("links", listLinks);
		System.out.println(allLinks);
		return allLinks;
	}
}

