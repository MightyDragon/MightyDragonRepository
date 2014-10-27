package org.arpit.java2blog;

import DummyClasses.Dog;
import src.simulator.Client;

public class ClientRun implements Runnable {
	
	public void run() {
		Client pokemonClient = new Client();

		
		pokemonClient.mainPokemon();
	}
	
}
