package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.model.Weather;
import src.simulator.GenVSim;
import fuser.ClientRun;

public class ClientRunTest {
	
	Thread t = new Thread();
	
	@Before
	public void ClientRunTest() {
		t = new Thread();
		ClientRun client = new ClientRun();
		t = new Thread(client);
		t.start(); // Pokemon project will run for a long time, more than enough for testing
	}
	
	@Test
	public void IsRunningTest() {
		assertTrue(t.isAlive());
	}
	
	@Test
	public void StackTraceTest() {
		try {
			t.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			fail();
		}
		StackTraceElement[] trace = t.getStackTrace();
		assertFalse(trace.length == 0);
		String mainName = trace[trace.length - 3].getMethodName();
		assertTrue(mainName.equals("mainFile"));
	}
	
	@Test
	public void ObjectCountTest() {
		try {
			t.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			fail();
		}
		assertTrue(GenVSim.getCounterGenVSim() > 0);
		assertEquals(Weather.getCounterWeather(), 4);
	}

}
