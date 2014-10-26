package org.arpit.java2blog;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

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
import DummyClasses.Cat;
import DummyClasses.Dog;
import DummyClasses.Elephant;

public class PokemonClassCollector {

	// Class used to manually create Araylist of all classes in Pokemon
ArrayList<Class> classes = new ArrayList<Class>();
	
	public PokemonClassCollector(){
		this.makeClasses();
		StringWriter sw = new StringWriter();
		new Throwable().printStackTrace(new PrintWriter(sw));
		System.out.println("Current stack trace is:\n\t" + sw.toString());
	
	}
	
	public void makeClasses(){
		Ability a = new Ability("asdf");
		classes.add(a.getClass());
		Nature n = new Nature("a", "b", "c");
		classes.add(n.getClass());
		Status s = new Status("n", "c");
		classes.add(s.getClass());
		Type t = new Type("t", true);
		classes.add(t.getClass());
		Move m = new Move("m", t, 0, 0);
		classes.add(m.getClass());
		Species sp = new Species("a", t, t);
		classes.add(sp.getClass());
		Pkmn p = new Pkmn(sp, 1, n);
		classes.add(p.getClass());
		Weather w = new Weather("a");
		classes.add(w.getClass());
		GenVSim g = new GenVSim(p, p, 0);
		classes.add(g.getClass());
		Client cl = new Client();
		classes.add(cl.getClass());
		
	}
	
	public ArrayList<Class> getClasses(){
		return classes;
	}
	
	public void Links(){
		
	}
	
}
