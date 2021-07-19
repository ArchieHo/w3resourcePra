package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_1 {

//	1. Write a Java program to get a number from the user and print whether it is positive or negative.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一數");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println(num + " is positive");
		}
		else {
			System.out.println(num + " is negative");
		}
	}

}
