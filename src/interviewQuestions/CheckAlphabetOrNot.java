package interviewQuestions;

import java.util.Scanner;

public class CheckAlphabetOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Char: ");
		char ch = input.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println("Char is Alphabet");
		}else {
			System.out.println("Char is not Alphabet");
		}

	}

}
