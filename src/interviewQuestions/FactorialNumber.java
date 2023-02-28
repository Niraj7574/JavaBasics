package interviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		//!5 = 5*4*3*2*1 = 120
		//!0 = 1
		
		int num = 4;
		int fact = 1;
		
		for (int i=1; i<=num; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial is:" + fact);

	}

}
