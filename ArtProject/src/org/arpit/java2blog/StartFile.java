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
		PokemonClassCollector objects = new PokemonClassCollector();
		ArrayList<Class> classList = objects.getClasses();
		
		ArrayList<Object[]> methodList = getMethodNames(classList);
		createJSONMethods(methodList);
		createJSONLinks();
		//Client pokemon = new Client();
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
		System.out.println(allMethods);
		return allMethods;
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
	
	public static JSONObject createJSONLinks(){
		JSONObject allLinks = new JSONObject();
		JSONArray listLinks = new JSONArray();
		
		for (int i=0;i<10;i++){
			
			JSONObject link = new JSONObject();
			link.put("source", i);
			if(i<10){
				link.put("target", i+1);
			}else{
				link.put("target", 0);
			}
			link.put("value", 1);
			listLinks.add(link);
		}
		allLinks.put("links", listLinks);
		System.out.println(allLinks);
		return allLinks;
	}
}