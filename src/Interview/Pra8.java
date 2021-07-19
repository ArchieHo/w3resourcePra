package Interview;

import java.util.Scanner;

public class Pra8 {

	//	設計一程式，提示使用者輸入兩個實數，印出他們的和、差、積、商(結果皆印製小數點第一位)。
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入第一個數: ");
		double n1 = scanner.nextDouble();
		System.out.println("請輸入第二個數: ");
		double n2 = scanner.nextDouble();
		
		System.out.printf("兩個數的和為:%.1f\n",(float)(n1 + n2));
		System.out.printf("兩個數的差為:%.1f\n",(float)(n1 - n2));
		System.out.printf("兩個數的積為:%.1f\n",(float)(n1 * n2));
		System.out.printf("兩個數的商為:%.1f",(float)(n1 / n2));
		scanner.close();
	}

}
