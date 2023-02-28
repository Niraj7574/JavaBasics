package oppConceptPart1;

public class FunctionsInJava {

	//Starting point of execution
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj ic reference variable, referring to this object
		//After creating the object, the copy of all not static method will be given to this method.
		
		obj.test();
		
		int i = obj.pqr();
		System.out.println(i);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int d1 = obj.division(30, 10);
		System.out.println(d1);
		
	}
	
	
	
	//non static methods
		
	//Void -- does not return any value
	//REturntype --> void
	public void test() {  //no input, no output
		System.out.println("test method");
	}
	
	
	//return type --> int
	public int pqr(){   //no input, some output
		System.out.println("PQR metod");
		int a = 10;
		int b = 20;
		int c = 30;
		
		return c;
		
	}
	
	//return type --> String
	public String qa() {  //no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	

	// x and y input arguments
	// return type --> int
	public int division(int x, int y) {   //some input, some output
		System.out.println("Division method");
		int d = x/y;
		
		return d;
	}
	
	
	
	
	
	
	
	
}
