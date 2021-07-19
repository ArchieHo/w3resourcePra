package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_11 {

//	11. Write a program in Java to display n terms of natural numbers and their sum. 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		int sum=0;
		
		for(int a = 1;a <=n;a++) {
			System.out.print(a + " ");
			sum = sum+a;
		}
		System.out.println();
		System.out.println(sum);
	}
	
}
