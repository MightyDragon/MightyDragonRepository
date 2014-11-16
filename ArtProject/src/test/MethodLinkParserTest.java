package test;

import static org.junit.Assert.*;
import japa.parser.ParseException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import src.model.Ability;
import src.model.Move;
import src.model.Nature;
import src.model.Pkmn;
import src.model.Species;
import src.model.Status;
import src.model.Type;
import src.model.Weather;
import src.simulator.Client;
import src.simulator.GenVSim;
import fuser.DummyObjects;
import fuser.MethodLinkParser;

public class MethodLinkParserTest {
	
	InputStream inDummy;
	InputStream inPkmn;
	
	@Before
	public void MethodLinkParserTest() throws FileNotFoundException {
		inDummy = new FileInputStream("src/fuser/DummyObjects.java");
		inPkmn = new FileInputStream("pokePackage/src/model/Pkmn.java");
	}
	
	@Test
	public void testNoErrorDummy() {
		try {
			MethodLinkParser.generateMethodLinks(inDummy, new ArrayList<Method>());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			assertTrue(true);
		}
	}
	
	@Test
	public void testNoErrorPkmn() {
		try {
			MethodLinkParser.generateMethodLinks(inPkmn, new ArrayList<Method>());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			assertTrue(true);
		}
	}
	
	@Test
	public void testDummyFindMethods() {
		Method[] methods = DummyObjects.class.getDeclaredMethods();
		ArrayList<Method> methodsList = new ArrayList<Method>();
		for (Method m : methods) {
			methodsList.add(m);
		}
		try {
			MethodLinkParser.generateMethodLinks(inDummy, methodsList);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			assertTrue(true);
		}
	}
	
	@Test
	public void testPkmnFindMethods() {
		Method[] methods = Pkmn.class.getDeclaredMethods();
		ArrayList<Method> methodsList = new ArrayList<Method>();
		for (Method m : methods) {
			methodsList.add(m);
		}
		try {
			MethodLinkParser.generateMethodLinks(inPkmn, methodsList);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			assertTrue(true); // TODO: stub
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testPkmnFindManyMethods() {
		List<Class> classes = new ArrayList<Class>();
		classes.add(Ability.class);
		classes.add(Nature.class);
		classes.add(Status.class);
		classes.add(Type.class);
		classes.add(Move.class);
		classes.add(Species.class);
		classes.add(Pkmn.class);
		classes.add(Weather.class);
		classes.add(GenVSim.class);
		classes.add(Client.class);
		ArrayList<Method> methodsList = new ArrayList<Method>();
		for (Class c : classes) {
			Method[] methods = c.getDeclaredMethods();
			for (Method m : methods) {
				methodsList.add(m);
			}
		}
		
		try {
			MethodLinkParser.generateMethodLinks(inPkmn, methodsList);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			assertTrue(true); // TODO: stub
		}
	}
	
	@Test
	public void testSomePkmnLinks() {
		List<Class> classes = new ArrayList<Class>();
		classes.add(Ability.class);
		classes.add(Nature.class);
		classes.add(Status.class);
		classes.add(Type.class);
		classes.add(Move.class);
		classes.add(Species.class);
		classes.add(Pkmn.class);
		classes.add(Weather.class);
		classes.add(GenVSim.class);
		classes.add(Client.class);
		ArrayList<Method> methodsList = new ArrayList<Method>();
		for (Class c : classes) {
			Method[] methods = c.getDeclaredMethods();
			for (Method m : methods) {
				methodsList.add(m);
			}
		}
		
		ArrayList<ArrayList<Method>> links = new ArrayList<ArrayList<Method>>();
//		ArrayList<Method> sampleLink1 = new ArrayList<Method>();
		
		try {
			links = MethodLinkParser.generateMethodLinks(inPkmn, methodsList);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		} finally {
			
			assertTrue(true); // TODO: stub
		}
	}

}
