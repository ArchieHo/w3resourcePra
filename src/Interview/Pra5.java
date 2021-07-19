package Interview;

import java.util.Scanner;

//設計一個程式，由使用者從螢幕輸入正整數n、m，將n至m所有整數由小至大印出，但每列只印出最多7個數字，如果輸入m小於(等於)n，則輸出沒有結果。
//【使用for loop 和 while loop 撰寫】(每一橫排、直排皆須對齊)範例如下:
public class Pra5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入兩個數字: ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int count = 0;
		//int countf = 0;
		while(m <= n) {
			System.out.println("沒有結果");
			break;
		}
		//for 方式
//		for(int i = n;i<=m;i++) {
//			countf++;
//			if(countf % 7 != 0) {
//				System.out.printf("%7d",i);
//			}
//			else if(count % 7 == 0) {
//				System.out.printf("%7d\n", i);
//			}
//		}
		//while 方式
		while( m >= n && count >= 0 ) { 
			count = count + 1;
			if(count % 7 != 0) {
				System.out.printf("%7d",n);    
			}
			else if(count % 7 == 0) {
				System.out.printf("%7d\n",n);    
			}
			n = n + 1;  
		}
			scanner.close();
	}
}
