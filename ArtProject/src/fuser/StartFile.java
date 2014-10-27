package fuser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.reflections.Reflections;

import static org.reflections.ReflectionUtils.*;
import src.simulator.Client;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter; 
import java.io.PrintWriter;


public class StartFile {

	public static void main(String args[]){
		System.out.println("And thus, we begin... ");
		
		// To run initial Animal Testing :) 
//		DummyObjects dummy = new DummyObjects();
//		ArrayList<Class> classList = dummy.getClasses();
//		ClientRun pkmnClient = new ClientRun();
//		Thread t = new Thread(pkmnClient);
//		t.start();
		
		// To run Pacman
//		PacmanClassCollector objects = new PacmanClassCollector();
//		ArrayList<Class> classList = objects.getClasses();
//		ClientRun pkmnClient = new ClientRun();
//		Thread t = new Thread(pkmnClient);
//		t.start();
		
		// To run Pokemon
		PokemonClassCollector objects = new PokemonClassCollector();
		ArrayList<Class> classList = objects.getClasses();
		ClientRun pkmnClient = new ClientRun();
		Thread t = new Thread(pkmnClient);
		t.start();
		
		
		// Demo for TAs to see our JSON objects for nodes. MUST COMMENT OUT LINE 74 AND 167. Its line 3 of the console
//		ArrayList<Object[]> methodList = getMethodNames(classList);
//		System.out.println(createJSONMethods(methodList));
		
		
		// This gets the stack trace ~~~~~~~~~~~~~~~~~~~`
	
		/*
		 * We didnt use the code in this link in the program but we used it to learn what was going on:
		 * Credit: http://stackoverflow.com/questions/1149703/how-can-i-convert-a-stack-trace-to-a-string
		 */
		while (t.isAlive()) {
			//System.out.println("Current stack trace:");
			
			//credit: used Java API
			StackTraceElement[] trace = t.getStackTrace();
			ArrayList<String[]> methodPairs = new ArrayList<String[]>();
			
			//gets stack size for creating pairs of methods (linked together)
			int stackNumber = trace.length;
			for(int i=0; i<stackNumber-2 ;i++) {
				String[] firstO = {trace[i].getMethodName(), trace[i+1].getMethodName()};
				methodPairs.add(firstO);
				}
			
			// goes to methods that make JSON objects
			
			ArrayList<Object[]> methodList = getMethodNames(classList);
//			createJSONMethods(methodList);
//			createJSONLinks(methodPairs, methodList);
			
			JSONObject nodesAndLinks = new JSONObject();
			nodesAndLinks.put("nodes", createJSONMethods(methodList));
			nodesAndLinks.put("links", createJSONLinks(methodPairs, methodList));
			System.out.println(nodesAndLinks);
			
			try {
				 
				FileWriter file = new FileWriter("war/miserables.json");
				file.write(nodesAndLinks.toJSONString());
				file.flush();
				file.close();
		 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// Gets Object[] where [0] is a Method and [1] is a Class. Outputs all methods in all classes.
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
		return pairs;
	}
	
	
	/*
	 *  Gets all pairs of methods that are linked through a method call. 
	 *  Have not implemented yet however we will use this as a resource:
	 *  Credit: I asked this question on stack overflow http://stackoverflow.com/questions/26554990/how-to-get-all-possible-callers-of-a-method-in-java-like-call-heirarchy
	 */
	public static ArrayList<String[]> getLinkPairs(){
		return null;
	}
	
	
	/*
	 * JSON creators (next two methods). Used my own brilliant mind for algorithms and also tutorial to learn JSON constructors 
	 * JSON tutorial found here http://www.tutorialspoint.com/json/json_java_example.html
	 */
	
	// Uses Object[0] where [0] is Method and [1] is Class to create JSON object for Visualizer
	public static JSONArray createJSONMethods(ArrayList<Object[]> classList){
		JSONObject allMethods = new JSONObject();
		JSONArray listMethods = new JSONArray();
		int groupNum = 0;
		String curClass = "";
		
		for (Object[] m : classList){
			JSONObject meth = new JSONObject();
			Method methodz = (Method)m[0];
			Class classz = (Class)m[1];
			meth.put("name", methodz.getName());
			meth.put("group", groupNum);
			if (!curClass.equals(classz.getName())) {
				groupNum++;
				curClass = classz.getName();
			}
			listMethods.add(meth);
		}
		//allMethods.put("nodes", listMethods);
		//System.out.println(allMethods);
		
		return listMethods;
	}
	

	/*
	 *  Uses stackMethods is a pair of Methods that will be linked together (because of method calls), 
	 *  and allMethods is the list of all our methods from all classes.
	 */
	public static JSONArray createJSONLinks(ArrayList<String[]> stackMethods, ArrayList<Object[]> allMethods){
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
			
			// Both methods in the pair must be found in order to create link between method nodes
			if(first && second){
				listLinks.add(link);
			}
		}
		//allLinks.put("links", listLinks);
		
		//Dynamically shows JSON objects as program is running of Links between methods (stack trace)
		//System.out.println(allLinks);
		return listLinks;
	}
}

