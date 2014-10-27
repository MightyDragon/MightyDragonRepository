package DummyClasses;

public class Dog{
	   String breed;
	   int age;
	   String color;

	   void barking(){
	   }
	   
	   void hungry(){
		   this.barking();
	   }
	   
	   void sleeping(){
		   this.hungry();
	   }
	   
	   void beingCute(){
		   this.sleeping();
	   }
	}