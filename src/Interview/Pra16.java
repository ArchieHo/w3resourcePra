package Interview;

import java.util.Scanner;

public class Pra16 {

//	設計一程式，提示使用者輸入多個整數，以0作為結束。分別計算這些數值中所含正數及負數的個數，並算出的總和及平均，並輸出結果。
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入整數(結束請輸入0)");
		int n = scanner.nextInt();
		int postive = 0;
		int negative = 0;
		int sum = 0;
		int count = 1;
		
		while(n != 0 ) {
			if(n > 0) {
				sum = sum + n;
				postive++;
				count++;
			}
			else {
				sum = sum +n;
				negative++;
				count++;
			}
			System.out.println("請輸入整數(結束請輸入0)");
			n = scanner.nextInt();
		}
		System.out.printf("正整數有:%s個\n",postive);
		System.out.printf("負整數有:%s個\n",negative);
		System.out.printf("總和為:%s\n",sum);
		System.out.printf("平均數為:%s\n",sum/count);

	}

}
