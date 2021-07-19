package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_16 {

//	16. Write a program in Java to display the pattern like right angle triangle with a number.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		
		for(int a = 1;a <= n;a++) {
			for(int b = 1;b <= a;b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
