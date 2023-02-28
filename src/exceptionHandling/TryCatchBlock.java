package exceptionHandling;

public class TryCatchBlock {

	int a = 10;
	public static void main(String[] args) {

	     //uncaught exception -- hint will not be there 
		 //int i = 9/0;
		 //System.out.println(i);
	
		
		//Caught exception   --hint will be given
		//Thread.sleep(2000);
		
		
		//1. try-catch block
		try {
			int i = 9/0;  // This code will throw an exception 
		}
		catch(ArithmeticException e) {
			e.printStackTrace();    //this will print the exception accruing line number in console
			System.out.println(e.getMessage());    //this will print the information of exception in console
		}
		
		System.out.println("xyz");
		System.out.println("xyz");
		System.out.println("xyz");

	}

}
