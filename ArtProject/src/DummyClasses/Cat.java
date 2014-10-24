package DummyClasses;

public class Cat{
	   String breed;
	   int age;
	   String color;

	   void meowing(){
	   }
	   
	   void hungry(){
		   this.scratching();
	   }
	   
	   void sleeping(){
	   }
	   
	   void scratching(){
		   Dog d = new Dog();
		   d.barking();
	   }
	   
	   void beingAnnoying(){
		   this.meowing();
		   this.scratching();
	   }
	}