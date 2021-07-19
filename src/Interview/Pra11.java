package Interview;

import java.util.Scanner;

public class Pra11 {

//	設計一個程式，提示使用者輸入金額，將此金額以100元、50元、20元、10元、5元、1元六種貨幣組合出該金額。
//	組合方式為依照面額由大至小的順序使用貨幣，且每種貨幣的數量為無限多，無法使用100元時才能使用50元，無法使用50元時才可以使用20元，依此類推。由螢幕輸出計算結果。
//	輸出格式為六個數字，第一個數字代表用幾個100元、第二個數字表示用幾個50元，依此類推。
//	例如: 輸入101，輸出: 1 0 0 0 0 1。
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		  System.out.println("請輸入一個金額");
		  int a = input.nextInt();
		    
		  int b = a / 100 ;
		  int c = ( a - b * 100 ) / 50;
		  int d = ( a - b * 100 - c * 50 ) / 20 ;
		  int e = ( a - b * 100 - c * 50 - d * 20) / 10;
		  int f = ( a - b * 100 - c * 50 - d * 20 - e * 10 ) / 5;
		  int g = ( a - b * 100 - c * 50 - d * 20 - e * 10 - f * 5 ) / 1;
		  
		  System.out.print(b);
		  System.out.print(c);
		  System.out.print(d);
		  System.out.print(e);
		  System.out.print(f);
		  System.out.print(g);
		}
	}
//		for(int i =1;i<=100;i++) {
//			if(i == 1 && num%10 < 5) {
//				int one = num%10;
//				String o = String.valueOf(one);
//				System.out.print(o+ " ");
//			}
//			else if(i == 5 && num%10 >=5) {
//				int five = num%10;
//				String fi = String.valueOf(five);
//				System.out.print(fi+" ");
//			}
//			else if(i == 10 && num%20 >= 10) {
//				int twenty = num%10;
//				String twe = String.valueOf(twenty);
//				System.out.print(twe+" ");
//			}
//			
//			else if(i == 50 && num%100 >= 50) {
//				int fifty = num%100/50;
//				String fif = String.valueOf(fifty);
//				System.out.print(fif+" ");
//			}
//			else if(i == 100 && num > 100 ) {
//				int hundred = num/100;
//				String hund = String.valueOf(hundred);
//				System.out.print(hund+" ");
//			}
//			
//		}
