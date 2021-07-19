package Interview;

import java.util.Scanner;

//撰寫一個程式讀入一個介於100 - 999的數字，然後顯示它的每位數和、積和差。
//例:932的每位數和是14、每位數積是54、每位數差是4。(百位數減十位數再減個位數)
public class Pra3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入100-999之間的數字");
		int num = scanner.nextInt();
		int first = num/100;
		int second = num%100/10;
		int last = num%10;
		
		System.out.println("三位數和為: " + (first + second + last));
		System.out.println("三位數乘為: " + first * second * last);
		System.out.println("三位數差為: " + (first - second - last));
	scanner.close();
	}
}
