package src.model;

public class Weather {
	
	static Weather SUNLIGHT = new Weather("Intense sunlight");
	static Weather RAIN = new Weather("Rain");
	static Weather SANDSTORM = new Weather("Sandstorm");
	static Weather HAIL = new Weather("Hail");
	
	String name;
	
	public Weather(String name) {
		this.name = name;
	}

}
