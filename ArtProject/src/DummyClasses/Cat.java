package DummyClasses;

public class Cat{
	   String breed;
	   int age;
	   String color;

	   public void meowing(){
	   }
	   
	   public void hungry(){
		   this.scratching();
	   }
	   
	   public void sleeping(){
	   }
	   
	   public void scratching(){
		   Elephant d = new Elephant();
		   d.entertainingGuests();
	   }
	   
	   public void beingAnnoying(){
		   this.meowing();
		   this.scratching();
	   }
	}