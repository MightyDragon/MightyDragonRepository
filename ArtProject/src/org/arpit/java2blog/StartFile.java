package org.arpit.java2blog;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import src.simulator.Client;

import java.lang.reflect.Method;
import java.util.ArrayList;



public class StartFile {

	public static void main(String args[]){
		System.out.println("And thus, we begin... ");
		System.out.println(Thread.getAllStackTraces());
		PokemonDummyObjects objects = new PokemonDummyObjects();
		ArrayList<Class> classList = objects.getClasses();
		
		ArrayList<Object[]> methodList = getMethodNames(classList);
		createJSONMethods(methodList);
		//Client pokemon = new Client();
	}
	
	public static void createJSONMethods(ArrayList<Object[]> classList){
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
		System.out.println(allMethods);
	}
	
	public static ArrayList<Object[]> getMethodNames(ArrayList<Class> classes){
		ArrayList<Object[]> pairs = new ArrayList<Object[]>();
		for (Class c : classes){
			Method[] cMethods = c.getDeclaredMethods();
			for (Method m : cMethods){
				Object[] p = {m, c};
				pairs.add(p);
			}
		}
		return pairs;
	}
	
	
}