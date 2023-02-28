package oppConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global variables  -- Class vars
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10;  //Local variable for Main method
		System.out.println(i);
		
		//To access the Global variable we have to create Object of that class
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);   
		System.out.println(obj.age);

	}
	
	public void sum() {
		int i = 15;  //Local variable for the Sum method
		int j = 20;
	}

}
