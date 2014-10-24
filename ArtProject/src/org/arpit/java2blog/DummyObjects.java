package org.arpit.java2blog;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import DummyClasses.Cat;
import DummyClasses.Dog;
import DummyClasses.Elephant;
public class DummyObjects {

	ArrayList<Class> classes = new ArrayList<Class>();
	
	public DummyObjects(){
		this.makeClasses();
	}
	
	public void makeClasses(){
		Dog prince = new Dog();
		classes.add(prince.getClass());
		Cat misty = new Cat();
		classes.add(misty.getClass());
		Elephant trumpet = new Elephant();
		classes.add(trumpet.getClass());
	}
	
	public ArrayList<Class> getClasses(){
		return classes;
	}
	
	public void Links(){
		
	}
	
	
	
}
