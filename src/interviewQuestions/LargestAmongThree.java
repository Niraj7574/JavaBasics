package interviewQuestions;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = input.nextInt();
		System.out.println("Enter second number");
		int y = input.nextInt();
		System.out.println("Enter third number");
		int z = input.nextInt();
		
		if(x>y && x>z) {
			System.out.println("X is greater number");
		}else if (y>x && y>z) {
			System.out.println("y is greater number");
		}else {
			System.out.println("Z is greater number");
		}
		

	}

}
