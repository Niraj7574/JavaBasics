package interviewQuestions;

import java.util.Scanner;

public class QuoetientAndReminder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Divident: ");

		int divident = input.nextInt();

		System.out.println("Enter Divisor: ");

		int divisor = input.nextInt();

		int quoetient = divident / divisor;
		int reminder = divident % divisor;
		
		System.out.println(quoetient);
		System.out.println(reminder);

	}

}
