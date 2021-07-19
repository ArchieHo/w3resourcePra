package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_13 {

//	13. Write a program in Java to display the cube of the number upto given an integer.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		int result = n*n*n;
		
		System.out.println(result);
//		如果是自行設定次方次數
//		System.out.println("請輸入一次方數:");
//		int cube = scan.nextInt();
//		int num = n;
//		
//		while(cube > 1) {
//			num = n*num;
//			cube--;
//		}
//		System.out.println(num);
	}
}
