package Interview;

import java.util.Scanner;

public class Pra17 {

//	設計一程式，提示使用者輸入正整數n，判斷此數是否為質數並將結果印出。
//	質數：除了1與本身之外沒有其他數字可以整除的數字。
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入正整數: ");
		int n = scanner.nextInt();
		
		// 個人的方法
//		for(int i =2;i < n;i++) {
//			if(n % i == 0 ) {
//				System.out.println("此數非質數");
//				return;
//			}
//		}
//		if(n == 1) {
//			System.out.println("此數非質數");
//		}
//		else {
//			System.out.print("此數為質數");
//		}
		
		// 網路的方法
		int count = 0;
		int num = 0;
		
		for(int i = 1;i <= n;i++) {
			num = i;
			if(n % num == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("此數為質數");
		}
		else {
			System.out.println("此數非質數");
		}
		
	}

}
