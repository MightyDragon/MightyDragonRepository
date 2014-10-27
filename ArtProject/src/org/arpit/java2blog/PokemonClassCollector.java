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
		
	}
	
	public ArrayList<Class> getClasses(){
		return classes;
	}
	
	public void Links(){
		
	}
	
}
