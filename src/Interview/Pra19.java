package Interview;

import java.util.Scanner;

public class Pra19 {

//	設計一程式，提示使用者輸入正整數n，將該數值轉換成二進位數制，並以16-bit方式於螢幕輸出結果。
//	例如:輸入18，輸出 0000 0000 0001 0010。
	未解
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一正整數: ");
		int num = scanner.nextInt();
		
		for(int a = 1;a <= 4;a++) {
			for(int b = 1;b <= 4;b++) {
				
				System.out.print("*");
			}
			System.out.print(" ");
		}
		scanner.close();
	}
}