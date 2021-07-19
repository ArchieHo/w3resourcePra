package Interview;

import java.util.Scanner;

public class Pra12 {

//	設計一個程式，提示使用者輸入三個數值，將此三個數值由小至大排列後，由螢幕輸出。
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入第一個數值:");
		int n1 = scanner.nextInt();
		System.out.println("請輸入第二個數值:");
		int n2 = scanner.nextInt();
		System.out.println("請輸入第三個數值:");
		int n3 = scanner.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			if(n2 > n3) {
				System.out.print(n1 + "," + n2 + ',' + n3);
			}
			else {
				System.out.print(n1 + "," + n3 + ',' + n2);
			}
		}
		else if(n2 > n1 && n2 >n3) {
			if(n1 > n3) {
				System.out.print(n2 + "," + n1 + ',' + n3);
			}
			else {
				System.out.print(n2 + "," + n3 + ',' + n1);
			}
		}
		else if(n3 > n1 && n3 > n2){
			if(n1 > n2) {
				System.out.print(n3 + "," + n1 + ',' + n2);
			}
			else {
				System.out.print(n3 + "," + n2 + ',' + n1);
			}
		}
	}

}
