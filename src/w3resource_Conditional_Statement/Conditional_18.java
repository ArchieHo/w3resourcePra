package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_18 {

//	18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		int c = 1;
		
		for(int a = 1;a <= n;a++) {
			for(int b = 1;b <= a;b++) {
				System.out.print(c++);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
