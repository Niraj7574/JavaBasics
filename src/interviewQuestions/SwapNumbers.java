package interviewQuestions;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int first = input.nextInt();
		
		System.out.println("Enter Second Number: ");
		int second = input.nextInt();
		
		System.out.println("Before Swap");
		System.out.println("First Number is "+ first);
		System.out.println("Second Number is "+ second);
		
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("After Swap");
		System.out.println("First Number is "+ first);
		System.out.println("Second Number is "+ second);

	}

}
