package src.model;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Status {
	
	public static int counter = 0;
	
	public static Status BURN = new Status("Burn", "BRN");
	public static Status FREEZE = new Status("Freeze", "FRZ");
	public static Status PARALYSIS = new Status("Paralysis", "PAR");
	public static Status POISON = new Status("Poison", "PSN");
	public static Status BAD_POISON = new Status("Badly Poisoned", "BADPSN");
	public static Status SLEEP = new Status("Sleep", "SLP");
	public static Status FAINT = new Status("Faint", "FNT");
	public static Status OKAY = new Status("Okay", "OK");
	
	String name;
	String code;

	public Status(String name, String code) {
		this.name = name;
		this.code = code;
		counter++;
	}
	
	public static int getCounter() {
	    return counter;
	}
	
}
