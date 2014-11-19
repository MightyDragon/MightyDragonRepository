package fuser;

import main.MainLibrary;


/* 
 * Acts as the runnable object for the code being analyzed
 * Credit: Used Java API to find out about this functionality
 */

public class LibraryRun implements Runnable {
	
	public void run() {
		
		//For running Library
		MainLibrary libMain = new MainLibrary();
		libMain.mainLib();
	}
	
}
