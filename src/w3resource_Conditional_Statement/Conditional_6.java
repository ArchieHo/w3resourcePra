package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_6 {

//	6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入兩數");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		if(n1 == n2) {
			System.out.println("兩數相等");
		}
		else {
			System.out.println("兩數不相等");
		}
		
	}
}
