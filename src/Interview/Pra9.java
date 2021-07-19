package Interview;

import java.util.Scanner;

public class Pra9 {
	
//	設計一程式，提示使用者輸入一個三位數整數，印出該數值的每個位數相乘後所得乘積數值。
//	例如:輸入123，輸出1 x 2 x 3 = 6。
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個三位數的整數:");
		int num = scanner.nextInt();
		
		int first = num/100;
		int second = (num%100)/10;
		int end = (num%100)%10;
		
		System.out.println(first * second * end);
	}

}
