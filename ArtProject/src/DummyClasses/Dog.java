package DummyClasses;

public class Dog{
	   String breed;
	   int age;
	   String color;

	   public void barking(){
		   Cat c = new Cat();
		   c.beingAnnoying();
		   
	   }
	   
	   public void hungry(){
		   this.barking();
	   }
	   
	   public void sleeping(){
		   this.hungry();
	   }
	   
	   public void beingCute(){
		   this.sleeping();
	   }
	}