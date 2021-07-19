package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_15 {

//	15. Write a program in Java to display the n terms of odd natural number and their sum.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		int sum =0;
		
		for(int a = 1;a < n*2;a++) {
			if(a % 2 != 0) {
				sum = sum + a;
				System.out.println(a);
			}
		}
		System.out.println(sum);
		
		
	}
}
