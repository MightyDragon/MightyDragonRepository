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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter; 
import java.io.PrintWriter;

//We used these two links to create the visualizer:
//  http://bl.ocks.org/mbostock/4062045
//  http://bl.ocks.org/mbostock/4566102


public class StartFile {
	
	 // Choose 0 for Pokemon, 1 for Library, and 2 for AnimalTesting. Default is pokemon if not valid number
	static int runProgramNumber = 0;
	
	public static void main(String args[]){	
		Thread t = new Thread();
		ArrayList<Object[]> methodList = new ArrayList<Object[]>();
		ArrayList<Object[]> objList;
		JSONArray allJSONlinks = new JSONArray();
		
 
		if(runProgramNumber==1){	
			// To run initial Animal Testing choose option 1
			
//			DummyObjects dummy = new DummyObjects();
//			ArrayList<Class> classList = dummy.getClasses();
//			ArrayList<Object[]> methodList = getMethodNames(classList);
//			int methodNum = methodList.size();
//			JSONArray allJSONlinks = createJSONRealLinks(methodNum, methodList);
//			LibraryRun libClient = new LibraryRun();
//			t = new Thread(libClient);
//			t.start();
		}
		
		else if(runProgramNumber==2){		
			// To run Library choose option 2
			LibraryClassCollector objects = new LibraryClassCollector();
			ArrayList<Class> classList = objects.getClasses();
			methodList = getMethodNames(classList);
			ArrayList<Method> methodArray = getMethodArray(methodList);
			ArrayList<ArrayList<Method>> methodLinkPairs = new ArrayList<ArrayList<Method>>();
			try {
				methodLinkPairs = getLinkPairsLibrary(methodArray);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("ERROR -- problem generating call heirarchy");
			}
			allJSONlinks = createJSONCallHeirarchy(methodLinkPairs, methodList);
			objList = getLibObjectNumber();
			LibraryRun libClient = new LibraryRun();
			t = new Thread(libClient);
			t.start();
			
		} 
		else{	
			//To run Pokemon choose any other integer other than 1 or 2
			PokemonClassCollector objects = new PokemonClassCollector();
			ArrayList<Class> classList = objects.getClasses();
			methodList = getMethodNames(classList);
			ArrayList<Method> methodArray = getMethodArray(methodList);
			ArrayList<ArrayList<Method>> methodLinkPairs = new ArrayList<ArrayList<Method>>();
			try {
				methodLinkPairs = getLinkPairsPokemon(methodArray);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("ERROR -- problem generating call heirarchy");
			}
			allJSONlinks = createJSONCallHeirarchy(methodLinkPairs, methodList);
			ClientRun pkmnClient = new ClientRun();
			t = new Thread(pkmnClient);
			t.start();
		}
		
		// This gets the stack trace`
		int j = 1;
		while (t.isAlive()) {
			
			//credit: used Java API
			StackTraceElement[] trace = t.getStackTrace();
			ArrayList<String[]> methodPairs = new ArrayList<String[]>();
			
			if (runProgramNumber==1){
				
			}
			if (runProgramNumber==2){
				objList = getLibObjectNumber();
			}
			else{
				objList = getPkmnObjectNumber();
			}
			
			
			//We didnt use the code in this link in the program but we used it to learn what was going on:
			//Credit: http://stackoverflow.com/questions/1149703/how-can-i-convert-a-stack-trace-to-a-string
			//gets stack size for creating pairs of methods (linked together)
			int stackNumber = trace.length;
			for(int i=0; i<stackNumber-2 ;i++) {
				String[] firstO = {trace[i].getMethodName(), trace[i+1].getMethodName()};
				methodPairs.add(firstO);
				}
			
			// goes to methods that make JSON objects
			JSONObject nodesAndLinks = new JSONObject();
			nodesAndLinks.put("nodes", createJSONMethods(methodList, methodPairs));
			nodesAndLinks.put("stacklinks", createJSONLinksStack(methodPairs, methodList));
			nodesAndLinks.put("objects", createJSONObjects(objList));
			nodesAndLinks.put("links", allJSONlinks);
			nodesAndLinks.put("stacklinks",createJSONLinksStack(methodPairs, methodList));
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
	
	
	//---------------------------- GET METHODS AND CLASSES THROUGH REFLECTION METHODS----------------------------------
	
	// Gets Object[] where [0] is a Method and [1] is a Class. Outputs all methods in all classes.
	public static ArrayList<Object[]> getMethodNames(ArrayList<Class> classes){
		ArrayList<Object[]> pairs = new ArrayList<Object[]>();
		int currentNumber=0;
		for (Class c : classes){
			Method[] cMethods = c.getDeclaredMethods();
			for (Method m : cMethods){
				int x = (new Random()).nextInt(900)+150;
				int y = (new Random()).nextInt(400)+150;
				Object[] p = {m, c,currentNumber, x, y};
				pairs.add(p);
				currentNumber++;
			}
		}
		return pairs;
	}
	
	
	//Uses method/class/position array to get an arraylist of just methods
	public static ArrayList<Method> getMethodArray(ArrayList<Object[]> methodClasses){
		ArrayList<Method> methodList = new ArrayList<Method>();
		for (Object[] o : methodClasses){
			Method m = (Method)o[0];
			methodList.add(m);
		}
		return methodList;
	}
	
	
	
	// -----------------------------------------GET CALL HEIRARCHY METHODS --------------------------------------
	
	/*
	 *  Gets all pairs of methods that are linked through a method call. 
	 *  Have not implemented yet however we will use this as a resource:
	 *  Credit: I asked this question on stack overflow http://stackoverflow.com/questions/26554990/how-to-get-all-possible-callers-of-a-method-in-java-like-call-heirarchy
	 */
	
	//Java API was used for getting the link pairs
	public static ArrayList<ArrayList<Method>> getLinkPairsPokemon(ArrayList<Method> methods) throws Exception{
		ArrayList<ArrayList<Method>> links = new ArrayList<ArrayList<Method>>();

		InputStream inAbility = new FileInputStream("pokePackage/src/model/Ability.java");
//		InputStream InputStream inActivePkmn = new FileInputStream("pokePackage/src/model/ActivePkmn.java");
		InputStream inMove = new FileInputStream("pokePackage/src/model/Move.java");
		InputStream inNature = new FileInputStream("pokePackage/src/model/Nature.java");
		InputStream inPkmn = new FileInputStream("pokePackage/src/model/Pkmn.java");
		InputStream inSpecies = new FileInputStream("pokePackage/src/model/Species.java");
		InputStream inStatus = new FileInputStream("pokePackage/src/model/Status.java");
		InputStream inType = new FileInputStream("pokePackage/src/model/Type.java");
		InputStream inWeather = new FileInputStream("pokePackage/src/model/Weather.java");

		InputStream inClient = new FileInputStream("pokePackage/src/simulator/Client.java");
		InputStream inGenVSim = new FileInputStream("pokePackage/src/simulator/GenVSim.java");

		links.addAll(MethodLinkParser.generateMethodLinks(inAbility, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inMove, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inNature, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inPkmn, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inSpecies, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inStatus, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inType, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inWeather, methods));

		links.addAll(MethodLinkParser.generateMethodLinks(inClient, methods));
		links.addAll(MethodLinkParser.generateMethodLinks(inGenVSim, methods));

		return links;
	}
	
	//Java API was used for getting the link pairs
	public static ArrayList<ArrayList<Method>> getLinkPairsLibrary(ArrayList<Method> methods) throws Exception{
		ArrayList<ArrayList<Method>> links = new ArrayList<ArrayList<Method>>();
		
		ArrayList<InputStream> inputs = new ArrayList<InputStream>();
		inputs.add(new FileInputStream("LibPackage/main/DatabaseHandler.java"));
		inputs.add(new FileInputStream("LibPackage/main/MainLibrary.java"));
		inputs.add(new FileInputStream("LibPackage/main/OracleConnection.java"));
		inputs.add(new FileInputStream("LibPackage/ui/MainFrame.java"));
		inputs.add(new FileInputStream("LibPackage/ui/NotificationDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/TopMenuBar.java"));
		inputs.add(new FileInputStream("LibPackage/ui/borrower/AccountInfoDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/borrower/PayFineDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/borrower/PlaceHoldDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/borrower/SearchDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/clerk/AddBorrowerDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/clerk/CheckOutDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/clerk/CheckOverdueDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/clerk/ReturnDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/librarian/AddBookDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/librarian/CheckOutReportDialog.java"));
		inputs.add(new FileInputStream("LibPackage/ui/librarian/MostPopularDialog.java"));
		
		for (InputStream in : inputs) {
			links.addAll(MethodLinkParser.generateMethodLinks(in, methods));
		}
		
		return links;
	}
	
	
	// -----------------------------------------GET OBJECT COUNT SECTION --------------------------------
	
	//Used this link to figure out how to get object count
	// http://stackoverflow.com/questions/20159104/count-number-of-existing-objects
	
	/* Gets an Object[] of class name and object count in that class for pokemon
	 */
	public static ArrayList<Object[]> getPkmnObjectNumber(){
		ArrayList<Object[]> pairs = new ArrayList<Object[]>();
		Object[] p1 = {"Ability", Ability.getCounter()};
		pairs.add(p1);
		Object[] p2 = {"Move", Move.getCounter()};
		pairs.add(p2);
		Object[] p3 = {"Nature", Nature.getCounter()};
		pairs.add(p3);
		Object[] p4 = {"Pkmn", Pkmn.getCounter()};
		pairs.add(p4);
		Object[] p5 = {"Species", Species.getCounter()};
		pairs.add(p5);
		Object[] p6 = {"Status", Status.getCounter()};
		pairs.add(p6);
		Object[] p7 = {"Weather", Weather.getCounter()};
		pairs.add(p7);
		Object[] p8 = {"GenVSim",  GenVSim.getCounter()};
		pairs.add(p8);
		
		return pairs;
	}
	
	
	/* Gets an Object[] of class name and object count in that class for Library
	 */
	public static ArrayList<Object[]> getLibObjectNumber(){
		
		ArrayList<Object[]> pairs = new ArrayList<Object[]>();
		Object[] p1 = {"DatabaseHandler", DatabaseHandler.getCounter()};
		pairs.add(p1);
		Object[] p2 = {"OracleConnection", OracleConnection.getCounter()};
		pairs.add(p2);
		Object[] p3 = {"MainFrame", MainFrame.getCounter()};
		pairs.add(p3);
		Object[] p4 = {"NotificationDialog", NotificationDialog.getCounter()};
		pairs.add(p4);
		Object[] p5 = {"TopMenuBar", TopMenuBar.getCounter()};
		pairs.add(p5);
		Object[] p6 = {"AccountInfoDialog", AccountInfoDialog.getCounter()};
		pairs.add(p6);
		Object[] p7 = {"PayFineDialog", PayFineDialog.getCounter()};
		pairs.add(p7);
		Object[] p8 = {"PlaceHoldDialog", PlaceHoldDialog.getCounter()};
		pairs.add(p8);
		Object[] p9 = {"SearchDialog", SearchDialog.getCounter()};
		pairs.add(p9);
		Object[] p10 = {"AddBorrowerDialog", AddBorrowerDialog.getCounter()};
		pairs.add(p10);
		Object[] p11 = {"CheckOutDialog", CheckOutDialog.getCounter()};
		pairs.add(p11);
		Object[] p12 = {"CheckOverdueDialog", CheckOverdueDialog.getCounter()};
		pairs.add(p12);
		Object[] p13 = {"ReturnDialog", ReturnDialog.getCounter()};
		pairs.add(p13);
		Object[] p14 = {"AddBookDialog", AddBookDialog.getCounter()};
		pairs.add(p14);
		Object[] p15 = {"CheckOutReportDialog", CheckOutReportDialog.getCounter()};
		pairs.add(p15);
		Object[] p16 = {"MostPopularDialog", MostPopularDialog.getCounter()};
		pairs.add(p16);
		
		return pairs;
	}

	
	
	// ------------------------------------ CREATE JSON SECTION ------------------------------------
	
	/*
	 * JSON creators (next two methods). Used my own brilliant mind for algorithms and also tutorial to learn JSON constructors 
	 * JSON tutorial found here http://www.tutorialspoint.com/json/json_java_example.html
	 */
	
	// Uses Object[0] where [0] is Method and [1] is Class to create JSON object for Visualizer
	public static JSONArray createJSONMethods(ArrayList<Object[]> classList, ArrayList<String[]> methodPairs){
		JSONObject allMethods = new JSONObject();
		JSONArray listMethods = new JSONArray();
		int groupNum = 0;
		String curClass = "";
		String[] currentMethodPair;
		
		if (methodPairs != null && !methodPairs.isEmpty()){
			currentMethodPair = methodPairs.get(0);
		}else{
			String[] m = {"mainFile", "mainFile"};
			currentMethodPair = m;
		}
		
		//boolean highlightedAlready = false;
		for (Object[] m : classList){
			JSONObject meth = new JSONObject();
			
			Method methodz = (Method)m[0];
			Class classz = (Class)m[1];
			meth.put("name", methodz.getName());
			meth.put("group", groupNum);
			if (methodz.getName().equals(currentMethodPair[0])) {
				meth.put("highlight","t");
				//highlightedAlready = false;
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
	
	public static JSONArray createJSONCallHeirarchy(ArrayList<ArrayList<Method>> stackMethods, ArrayList<Object[]> allMethods){
		JSONObject allLinks = new JSONObject();
		JSONArray listLinks = new JSONArray();
		
		for (ArrayList<Method> pair : stackMethods){
			JSONObject link = new JSONObject();
			boolean first = false;
			boolean second = false;
			Method m1 = pair.get(0);
			Method m2 = pair.get(1);
			for (Object[] currentMethod : allMethods){

				if(m1.getName().equals(((Method) currentMethod[0]).getName())){
					link.put("source", currentMethod[2]);
					first = true;
				}
				
				if(m2.getName().equals(((Method) currentMethod[0]).getName())){
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
	
	
	// Creates JSON object to input int the visualizer
		public static JSONArray createJSONObjects(ArrayList<Object[]> objectList){
			JSONArray listObjects = new JSONArray();

			int classNum = 0;
			for (Object[] o : objectList) {
				int classObjectNum = (int) o[1];
				for (int i=0; i<classObjectNum; i++){
					JSONObject obj = new JSONObject();
					obj.put("x", (new Random()).nextInt(1180)+10);
					obj.put("y", (new Random()).nextInt(680)+10);
					obj.put("group", classNum);
					listObjects.add(obj);
				}
				classNum++;
			}		
			return listObjects;
		}
		
		
		
	// ------------------------MISCELLANEOUS METHODS AND TESTS SECTION --------------------------
		
	// Somewhere on stack overflow on how to make random numbers
	public static int rand(int min, int max){
		Random rand = new Random();
		int randomNum = rand.nextInt((max-min)+1)+min;
		return randomNum;
	}
	
	
	// Created for testing visualizer
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

