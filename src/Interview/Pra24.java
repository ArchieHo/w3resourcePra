package Interview;

import java.util.Scanner;

public class Pra24 {
	
//	將一個正整數分解質因數。例如：輸入90一個最小的質數k，然後按下述步驟完成：
//	*(1)如果這個質數恰等於n，則說明分解,列印出90=2*3*3*5。
//	*程式分析：對n進行分解質因數，應先找到質因數的過程已經結束，列印出即可。
//	*(2)如果n <> k，但n能被k整除，則應列印出k的值，並用n除以k的商,作為新的正整數你n,重複執行第一步。
//	*(3)如果n不能被k整除，則用k 1作為k的值,重複執行第一步。
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int k = 2;
		System.out.println("請輸入一正整數:");
		int num = scanner.nextInt();
		System.out.print(num + "=");
		while(num > k) {
			if(num % k == 0) {
				System.out.print(k + "*");
				num = num/k;
			}
			else {
				k++;
			}
		}
		System.out.println(k);
		scanner.close();
	}
}
