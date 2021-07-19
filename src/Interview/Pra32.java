package Interview;

import java.util.Scanner;

public class Pra32 {

//	設計一程式，輸入n，印出以下內容(以下以n=5 舉例):
//
//		  12345
//		   1234
//		    123
//	         12
//	          1

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int num = scan.nextInt();
		
		for(int a = 1;a <= num;a++) {
			for(int b = 1;b < a;b++) {
				System.out.print(" ");
			}
			for(int c = 1;c <= num-a+1; c++) {
				System.out.print(c);
			}
			System.out.println();
			scan.close();
		}
		
	}

}
