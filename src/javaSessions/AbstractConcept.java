package javaSessions;

public abstract class AbstractConcept { // Abstract class or method has abstract keyword

	// Partial abstraction
	// hiding the implementation logic -- called abstraction
	//Abstract class can have the abstract methods and non-abstract methods
	//CAn not create the object of abstract class and interface

	public abstract void loan(); // Abstract Class should have at least one abstract method that has no body.
	
	
	//Non-abstract methods
	public void credit() {
		System.out.println("Bank-------Credit");
	}

	public void debit() {
		System.out.println("Bank-------Debit");
	}

}
