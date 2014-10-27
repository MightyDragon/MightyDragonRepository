package fuser;

import ca.ubc.cpsc210.pacman.ui.Game;
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
		
		//For running Pacman
//		Game pacmanGame = new Game();
	}
	
}
