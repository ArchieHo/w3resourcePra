package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_14 {

//	14. Write a program in Java to display the multiplication table of a given integer.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		
		for(int a = 0;a <= n;a++) {
			System.out.printf("%s X %s = %s\n",n,a,n*a);
		}
		
	}
}
