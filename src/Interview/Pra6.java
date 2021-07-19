package Interview;

import java.util.Scanner;

public class Pra6 {
//	設計一程式，印出以下內容(以下以n=5 舉例):
//		 5!=120		12345	
//		 4!=24		1234
//		 3!=6		123
//		 2!=2		12
//		 1!=1		1

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一個數字:");
		int n = scanner.nextInt();
		int sum = 1;
		
		for(int a = 0;a <= n-1;a++) {
			for(int b = 1;b <=n-a;b++) {
				sum = sum*b;
			}
			System.out.printf("%s!=%s",n,sum);
			System.out.println();
			sum = 1;
		}
		scanner.close();
	}

}
