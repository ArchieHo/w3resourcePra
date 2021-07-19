package Interview;

import java.util.Scanner;

public class Pra15 {

//	設計一程式，提示使用者輸入平面座標值x,y，判斷座標點所在區域並輸出適當描述。(描述該點位於1. 原點  2. X軸  3. Y軸  4. 第n象限 )
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入x,y座標");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x ==0 && y==0 ) {
			System.out.println("原點");
			System.out.println("X軸: " + x);
			System.out.println("Y軸: " + y);
		}
		else if(x > 0 && y > 0 ) {
			System.out.println("X軸: " + x);
			System.out.println("Y軸: " + y);
			System.out.println("第一象限");
		}
		else if(x < 0 && y > 0 ) {
			System.out.println("X軸: " + x);
			System.out.println("Y軸: " + y);
			System.out.println("第二象限");
		}
		else if(x < 0 && y < 0 ) {
			System.out.println("X軸: " + x);
			System.out.println("Y軸: " + y);
			System.out.println("第三象限");
		}
		else if(x > 0 && y < 0 ) {
			System.out.println("X軸: " + x);
			System.out.println("Y軸: " + y);
			System.out.println("第四象限");
		}
		else {
			System.out.println("X軸: " + x);
			System.out.println("Y軸: " + y);
		}
	}

}
