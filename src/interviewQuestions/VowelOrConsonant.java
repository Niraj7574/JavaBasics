package interviewQuestions;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = input.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("character is Vowel");
		}else {
			System.out.println("character is Consonant");
		}
		
	}

}
