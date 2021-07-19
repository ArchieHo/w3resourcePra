package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_20 {

//	20. Write a program in Java to print the Floyd's Triangle.
	
//	Input number of rows :  5
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		int c = 1;
		
		for(int a = 1;a <=n;a++) {
			for(int b = 1;b <=a;b++) {
				System.out.print(c++ + " ");
			}
			System.out.println();
		}
	}
}
