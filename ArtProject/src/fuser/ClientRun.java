package fuser;

import src.simulator.Client;


/* 
 * Acts as the runnable object for the code being analyzed
 * Credit: Used Java API to find out about this functionality
 */

public class ClientRun implements Runnable {
	
	public void run() {

		//For running Pokemon
		Client pokemonClient = new Client();
		pokemonClient.mainFile();
		
	}
	
}
