package Interview;

import java.util.Scanner;

public class Pra10 {
	
//	設計一程式，提示使用者輸入一個三位數整數，計算出此數值的每個位數後，將所有位數以相反順序重新組合成整數值，並將結果列印出。
//	例如:輸入 123，輸出321
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個三位數整數:");
		int num = scanner.nextInt();
		
		String str = String.valueOf(num);
		char[] temp = str.toCharArray();
		for(int i = temp.length-1;i>=0;i--) {
			System.out.print(temp[i]);
		}
//		String first = String.valueOf(num/100);
//		String second = String.valueOf(num%100/10);
//		String end = String.valueOf(num%100%10);
//		
//		System.out.print(end+second+first);
		
	}
}
