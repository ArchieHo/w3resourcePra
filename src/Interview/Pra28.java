package Interview;

import java.util.Scanner;

public class Pra28 {

//	設計一個程式，提示使用者輸入一個大寫英文字母，將其轉換成小寫英文字母，並將轉換結果列印出。
//	例如:輸入A，輸出a。
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一個大寫字母:");
		String word = scan.nextLine();
		char temp = word.toLowerCase().charAt(0);
		
		System.out.print(temp);
		scan.close();
	}

}
