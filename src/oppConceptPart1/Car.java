package oppConceptPart1;

public class Car {
	
	//Class(Global) Variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		
		//new Car(); -- is the object of Car class
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2018;
		b.wheel = 4;
		
		c.mod = 2022;
		c.wheel = 4;
		
		System.out.println("Before shifting the References");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the References");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);  //10
		c.mod = 20;
		System.out.println(a.mod);  //20
		System.out.println(c.mod);
		
	}

}
