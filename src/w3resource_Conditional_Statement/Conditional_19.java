package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_19 {

//	19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
	
//	    1
//     2 2
//    3 3 3
//   4 4 4 4
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		
		for(int a = 1;a <= n;a++) {
			for(int b = 1;b <= n-a;b++) {
				System.out.print(" ");
			}
			for(int c = 1;c <=a;c++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}
