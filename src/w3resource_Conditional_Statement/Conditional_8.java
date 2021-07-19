package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_8 {

//	8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. 
//	If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一字元");
		String letter = scan.nextLine().toLowerCase();
		
		boolean upperLetter = letter.charAt(0) >=65 && letter.charAt(0) <=90;
		boolean lowerLetter = letter.charAt(0) >= 97 && letter.charAt(0) <= 122;
		boolean vowel = letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") ||
				letter.equals("u");
		
		if(letter.length() > 1) {
			System.out.println("error,this is not a letter");
		}
		else if(!(upperLetter || lowerLetter)) {
			System.out.println("error,this letter is not a-z ,A-Z");
		}
		else if(vowel) {
			System.out.println("It's vowel");
		}
		else {
			System.out.println("It's consonant");
		}
	}
	
}
