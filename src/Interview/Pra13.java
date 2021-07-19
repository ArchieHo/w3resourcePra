package Interview;

import java.util.Scanner;

public class Pra13 {

//	設計一個程式，提示使用者輸入分數，將其分數依照不同等級由螢幕輸出。分數分級如下:
//		等級     分數區間
//		A             90~100    
//		B              80~89
//		C              70~79
//		D              60~69
//		E                0~59
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入0~100區間的分數:");
		int num = scanner.nextInt();
		
		if(num >=90 && num <=100) {
			System.out.print("A");
		}
		else if(num >= 80 && num < 90) {
			System.out.print("B");
		}
		else if(num >= 70 && num < 80) {
			System.out.print("C");
		}
		else if(num >= 60 && num < 70) {
			System.out.print("D");
		}
		else {
			System.out.print("E");
		}

	}

}
