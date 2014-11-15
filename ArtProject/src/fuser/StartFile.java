package fuser;

import main.DatabaseHandler;
import main.OracleConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.reflections.Reflections;

import static org.reflections.ReflectionUtils.*;
import src.model.Ability;
import src.model.Move;
import src.model.Nature;
import src.model.Pkmn;
import src.model.Species;
import src.model.Status;
import src.model.Weather;
import src.simulator.Client;
import src.simulator.GenVSim;
import ui.MainFrame;
import ui.NotificationDialog;
import ui.TopMenuBar;
import ui.borrower.AccountInfoDialog;
import ui.borrower.PayFineDialog;
import ui.borrower.PlaceHoldDialog;
import ui.borrower.SearchDialog;
import ui.clerk.AddBorrowerDialog;
import ui.clerk.CheckOutDialog;
import ui.clerk.CheckOverdueDialog;
import ui.clerk.ReturnDialog;
import ui.librarian.AddBookDialog;
import ui.librarian.CheckOutReportDialog;
import ui.librarian.MostPopularDialog;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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
//		ArrayList<Object[]> methodList = getMethodNames(classList);
//		int methodNum = methodList.size();
//		JSONArray allJSONlinks = createJSONRealLinks(methodNum, methodList);
//		ClientRun pkmnClient = new ClientRun();
//		Thread t = new Thread(pkmnClient);
//		t.start();
		
		// To run Library
//		LibraryClassCollector objects = new LibraryClassCollector();
//		ArrayList<Class> classList = objects.getClasses();
//		ArrayList<Object[]> methodList = getMethodNames(classList);
//		int methodNum = methodList.size();
//		JSONArray allJSONlinks = createJSONLinksStatic(methodNum, methodList);
//		ClientRun libClient = new ClientRun();
//		Thread t = new Thread(libClient);
//		t.start();
		
		// To run Pokemon
		PokemonClassCollector objects = new PokemonClassCollector();
		ArrayList<Class> classList = objects.getClasses();
		ArrayList<Object[]> methodList = getMethodNames(classList);
		int methodNum = methodList.size();
		JSONArray allJSONlinks = createJSONLinksStatic(methodNum, methodList);
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
		int j = 1;
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
			
//			ArrayList<Object[]> methodList = getMethodNames(classList);
//			createJSONMethods(methodList);
//			createJSONLinks(methodPairs, methodList);
			
			JSONObject nodesAndLinks = new JSONObject();
			nodesAndLinks.put("nodes", createJSONMethods(methodList));
			//nodesAndLinks.put("links", createJSONLinksStack(methodPairs, methodList));
			nodesAndLinks.put("links", allJSONlinks);
			System.out.println(nodesAndLinks);
			
			try {
				 
				FileWriter file = new FileWriter("war/json/miserables"+ j +".json");
				j++;
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
				int x = (new Random()).nextInt(400)+250;
				int y = (new Random()).nextInt(200)+150;
				Object[] p = {m, c,currentNumber, x, y};
				pairs.add(p);
				currentNumber++;
			}
		}
		return pairs;
	}
	
	public static ArrayList<Method> getMethodArray(ArrayList<Object[]> methodClasses){
		ArrayList<Method> methodList = new ArrayList<Method>();
		for (Object[] o : methodClasses){
			Method m = (Method)o[0];
			methodList.add(m);
		}
		return methodList;
	}
	
	/*
	 *  Gets all pairs of methods that are linked through a method call. 
	 *  Have not implemented yet however we will use this as a resource:
	 *  Credit: I asked this question on stack overflow http://stackoverflow.com/questions/26554990/how-to-get-all-possible-callers-of-a-method-in-java-like-call-heirarchy
	 */
	public static ArrayList<String[]> getLinkPairs(ArrayList<Method> methods){
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
		
		boolean highlightedAlready = true;
		
		//objects instantiated in Pokemon 
//		System.out.println("--------------------------fuck the police -----------------------");
//		System.out.println("Number of Ability: " + Ability.getCounter());
//		System.out.println("Number of Move: " + Move.getCounter());
//		System.out.println("Number of Nature: " + Nature.getCounter());
//		System.out.println("Number of Pkmn: " + Pkmn.getCounter());
//		System.out.println("Number of Species: " + Species.getCounter());
//		System.out.println("Number of Status: " + Status.getCounter());
//		System.out.println("Number of Weather: " + Weather.getCounter());
//		System.out.println("Number of GenVSim: " + GenVSim.getCounter());
		
		//objects instantiated in Library
//		System.out.println("Number of DatabaseHandler: " + DatabaseHandler.getCounter());
//		System.out.println("Number of OracleConnection: " + OracleConnection.getCounter());
//		System.out.println("Number of MainFrame: " + MainFrame.getCounter());
//		System.out.println("Number of NotificationDialog: " + NotificationDialog.getCounter());
//		System.out.println("Number of TopMenuBar: " + TopMenuBar.getCounter());
//		System.out.println("Number of AccountInfoDialog: " + AccountInfoDialog.getCounter());
//		System.out.println("Number of PayFineDialog: " + PayFineDialog.getCounter());
//		System.out.println("Number of PlaceHoldDialog: " + PlaceHoldDialog.getCounter());
//		System.out.println("Number of SearchDialog: " + SearchDialog.getCounter());
//		System.out.println("Number of AddBorrowerDialog: " + AddBorrowerDialog.getCounter());
//		System.out.println("Number of CheckOutDialog: " + CheckOutDialog.getCounter());
//		System.out.println("Number of CheckOverdueDialog: " + CheckOverdueDialog.getCounter());
//		System.out.println("Number of ReturnDialog: " + ReturnDialog.getCounter());
//		System.out.println("Number of AddBookDialog: " + AddBookDialog.getCounter());
//		System.out.println("Number of CheckOutReportDialog: " + CheckOutReportDialog.getCounter());
//		System.out.println("Number of MostPopularDialog: " + MostPopularDialog.getCounter());

		
//		Map<JSONObject, ArrayList<Object>> map = new HashMap<JSONObject, ArrayList<Object>>();
//		ArrayList<Object> values = new ArrayList<Object>();
//		
//		values.add((new Random()).nextInt(400)+250);
//		values.add((new Random()).nextInt(200)+150);
//		map.put(allMethods, values);
		
//		for (Object[] m : classList){
//			int x = (new Random()).nextInt(400)+250;
//			int y = (new Random()).nextInt(200)+150;
//			m[2] = x;
//			m[3] = y;
//		}
		
		
		
		for (Object[] m : classList){
			JSONObject meth = new JSONObject();
			Method methodz = (Method)m[0];
			Class classz = (Class)m[1];
			meth.put("name", methodz.getName());
			meth.put("group", groupNum);
			if (highlightedAlready) {
				meth.put("highlight","t");
				highlightedAlready = false;
			} else {
				meth.put("highlight","f");
			}
			meth.put("x", (int)m[3]);
			meth.put("y", (int)m[4]);
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
	public static JSONArray createJSONLinksStack(ArrayList<String[]> stackMethods, ArrayList<Object[]> allMethods){
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
	
	
	// Somewhere on stack overflow on how to make random numbers
	public static int rand(int min, int max){
		Random rand = new Random();
		int randomNum = rand.nextInt((max-min)+1)+min;
		return randomNum;
	}
	public static JSONArray createJSONLinksStatic(int numMethods, ArrayList<Object[]> allMethods){
		JSONObject allLinks = new JSONObject();
		JSONArray listLinks = new JSONArray();
		
		for (Object[] m : allMethods){
			int links = rand(0, 1);
			int methodNumber = (int)m[2];
			for (int i=0; i<links; i++){
				JSONObject link = new JSONObject();
				link.put("source", methodNumber);
				link.put("target", rand(0,numMethods-1));
				listLinks.add(link);
			}
			
		}
	//allLinks.put("links", listLinks);
	
	//Dynamically shows JSON objects as program is running of Links between methods (stack trace)
	//System.out.println(allLinks);
	return listLinks;
}
}

