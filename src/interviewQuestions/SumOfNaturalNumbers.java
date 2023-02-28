package interviewQuestions;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive number");
		int x = input.nextInt();
		
		int sum = 0;
		for(int i=0; i<=x; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum is: " + sum);
		
		
		System.out.println("----------------");
		int sum1 = 0;
		int j = 0;
		while(j<=x) {
			sum1 = sum1 +j;
			j++;
			
		}
		
		System.out.println("Sum is: " + sum1);

	}

}
