package interviewQuestions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		if(number%2 == 0) {
			System.out.println("Entered number is even");
		}else {
			System.out.println("Entered number is odd");
		}
	}

}
