package interviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 
		
		int num = 5;
		int t1 = 0;
		int t2 = 1;
		
		for(int i=1; i<=num; i++) {
			System.out.println(t1); 
			int num1 = t1 + t2;
			t1 = t2;
			t2 = num1;
		}
		
		

	}

}
