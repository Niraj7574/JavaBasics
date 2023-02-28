package oppConceptPart2;

public class BMW extends Car{  //"has-a relationship"
	
	
	//When same method is present in parent class and child class with the same name and same number of arguments, 
	//is called method overriding.
	public void start() {  //Overriden Method
		System.out.println("BMW---Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW---theftSafety");
	}

}
