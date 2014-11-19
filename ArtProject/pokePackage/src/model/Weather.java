package src.model;

public class Weather {
	
	public static int counter = 0;
	
	static Weather SUNLIGHT = new Weather("Intense sunlight");
	static Weather RAIN = new Weather("Rain");
	static Weather SANDSTORM = new Weather("Sandstorm");
	static Weather HAIL = new Weather("Hail");
	
	String name;
	
	public Weather(String name) {
		this.name = name;
		counter++;
	}
	
	public static int getCounterWeather() {
	    return counter;
	}

}
