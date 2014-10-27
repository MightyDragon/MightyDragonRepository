package DummyClasses;

public class Elephant{
	   String breed;
	   int age;
	   String color;

	   public void sprayingWater(){
		   hungry();
	   }
	   
	   public void hungry(){
	   }
	   
	   public void sleeping(){
	   }
	   
	   public void entertainingGuests(){
		   sprayingWater();
		   entertainingGuests();
	   }
	}