package oppConceptPart1;

public class methodOverLoading {

	public static void main(String[] args) {
		
		methodOverLoading obj = new methodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}
	
	//You can not create a method inside a method.
	//Method overloading is when the method name is same with different arguments/parameters within the same class.
	
	public void sum() {  // 0 parameters
		System.out.println("Sum Method");
		
	}
	
	public void sum(int i) {  // 1 input parameter
		System.out.println("Sum Method");
		System.out.println(i);
		
	}
	
	public void sum(int i, int j) {  // 2 input parameters
		System.out.println("Sum Method");
		System.out.println(i+j);
		
	}


}
