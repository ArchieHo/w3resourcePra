package Interview;

import java.util.Scanner;

public class Pra30 {

//	設計一程式，輸入n，印出以下內容(以下以n=5 舉例):
//
//        1
//       212
//      32123
//     4321234
//    543212345
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int n = scan.nextInt();
		
		for(int a = 1;a <= n;a++) {			//幾層
			for(int b = n-1;b >= a;b--) {		//幾格空格
				System.out.print(" ");
			}
			for(int c = a ; c >= 1 ; c-- ) {	//哪幾個數字
		     System.out.print(c);      
		    }
			while(a >= 2) {
				for(int d = 2;d <= a;d++) {
					System.out.print(d);
				}
				break;
			}
			System.out.println();
		}
		scan.close();
	}

}
