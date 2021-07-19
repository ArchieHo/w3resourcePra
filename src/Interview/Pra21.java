package Interview;

import java.util.Scanner;

public class Pra21 {

//	有一對兔子，從出生後第3個月起每個月都生一對兔子，小兔子長到第三個月後每個月又生一對兔子，假如兔子都不死，問每個月的兔子對數為多少？
//	程式分析： 兔子的規律為數列1,1,2,3,5,8,13,21....
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入月份");
		int n = scanner.nextInt();
		
		System.out.printf("兔子%s月對數為:%s",n,rabbit(n));
		scanner.close();
	}
		public static int rabbit(int n) {
			if(n == 1) {
				return 1;
			}
			else if(n == 2) {
				return 1;
			}
			else {
				return rabbit(n-1) + rabbit(n-2);
			}
	}
}

