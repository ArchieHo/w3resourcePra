package Interview;

import java.util.Scanner;

public class Pra7 {
	
//	設計一程式，提示使用者輸入兩個整數數值，以整數方式印出它們的和、差、積、商。
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入第一個值: ");
		int num1 = scanner.nextInt();
		System.out.println("請輸入第二個值: ");
		int num2 = scanner.nextInt();
		
		System.out.println("兩個值的和: " + (num1 + num2));
		System.out.println("兩個值的差: " + (num1 - num2));
		System.out.println("兩個值的積: " + (num1 * num2));
		System.out.println("兩個值的商: " + (num1 / num2));
		scanner.close();
	}

}
