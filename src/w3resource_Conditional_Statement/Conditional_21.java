package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_21 {

//	21. Write a program in Java to display the pattern like a diamond.
	
//       *                                                                          
//      ***                                                                         
//     *****                                                                        
//      ***    
//       *	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		
		for(int a = 1;a <= n;a++) {
			for(int b = 1;b <= n-a;b++) {
				System.out.print(" ");
			}
			for(int c = 1;c <=a*2-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a = n-1;a > 0;a--) {
			for(int b = 1;b <= n-a;b++) {
				System.out.print(" ");
			}
			for(int c = 1;c <=a*2-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




