package oppConceptPart2;

public class TestCar {

	public static void main(String[] args) {
	
		
	// Static polymorphism  --  compile-time polymorphism 	
	BMW b = new BMW();
		
	b.start();
	b.stop();
	b.refuel();
	b.theftSafety();
	b.engine();
	System.out.println("-----------------------");
	
	Car c = new Car();
	c.start();
	c.stop();
	c.refuel();
	System.out.println("-----------------------");
	
	
	//Top Casting
	Car c1 = new BMW();  //Child class object can be referred by parent class reference variable -- dynamic polymorphism --> runtime polymorphysm
	c1.start();
	c1.stop();
	c1.refuel();
	
	//Down Casting
	BMW b1 = (BMW) new Car();  //ClassCastException
	
	}

}
