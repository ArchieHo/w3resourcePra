package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_17 {

//	17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		
		for(int a = 1;a <= n;a++) {
			for(int b = 1;b <= a;b++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
