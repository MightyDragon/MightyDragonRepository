package fuser;

import main.MainLibrary;
import DummyClasses.AnimalTests;
import DummyClasses.Dog;
import src.simulator.Client;


/* 
 * Acts as the runnable object for the code being analyzed
 * Credit: Used Java API to find out about this functionality
 */

public class ClientRun implements Runnable {
	
	public void run() {
		
//		//For running Dummy Animals
//		AnimalTests t = new AnimalTests();
//		t.beginAllTests();
		
		//For running Pokemon
		Client pokemonClient = new Client();
		pokemonClient.mainPokemon();
		
		
		//For running Library
//		MainLibrary libMain = new MainLibrary();
//		libMain.mainLib();
	}
	
}
