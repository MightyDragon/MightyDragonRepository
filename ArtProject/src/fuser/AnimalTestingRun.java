package fuser;

import DummyClasses.AnimalTests;
import DummyClasses.Dog;



/* 
 * Acts as the runnable object for the code being analyzed
 * Credit: Used Java API to find out about this functionality
 */

public class AnimalTestingRun implements Runnable {
	
	public void run() {
		
		//For running Dummy Animals
		AnimalTests t = new AnimalTests();
		t.beginAllTests();

	}
	
}
