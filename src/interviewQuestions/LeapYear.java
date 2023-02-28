package interviewQuestions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		
		int year = input.nextInt();
		
		//year can be divided by 4, but should not be century year 
		//year can be divided by 400
		
		if(year%4 == 0 && year%100 != 0 || year%400 ==0) {
			System.out.println(year + "is leap year");
		}else {
			System.out.println(year + "is not leap year");
		}

	}

}
