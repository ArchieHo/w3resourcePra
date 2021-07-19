package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_4 {

//	4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". 
//	Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一數");
		double a = scan.nextDouble();
		
		if(a > 0) {
			if(a < 1) {
				System.out.println("Positive number less than 1");
			}
			else if(a > 1000000) {
				System.out.println("Positive number large than 1000000");
			}
			else {
				System.out.println("Positive number");
			}
		}
		else if (a < 0) {
			if(Math.abs(a) < 1) {
				System.out.println("Negative number less than 1");
			}
			else if(Math.abs(a) > 1000000) {
				System.out.println("Negative number large than 1000000");
			}
			else {
				System.out.println("Negative number");
			}
		}
		
	}

}
