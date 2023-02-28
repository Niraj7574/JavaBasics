package oppConceptPart1;

public class StaticAndNonStaticConcept {
	
	//Scope of the Global variable is avai;able across all the functions.
	String name = "Tome";  // Non-static Global variable can be used by creating object
	static int age = 25;  // static Global variable can be use directly

	public static void main(String[] args) {
	
		//How to call static methods and variables?
		//1. direct calling
		sum();
		//2. calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);  //or
		System.out.println(StaticAndNonStaticConcept.age);
		
		//Calling non static variable and method
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.sendMail();
		
		//Can I access static method by object reference? yes
		
	}
	
	public void sendMail() {  // Non-static method
		System.out.println("sendMail method");
	}
	
	public static void sum() {  // static method
		System.out.println("sum method");
		}
}
