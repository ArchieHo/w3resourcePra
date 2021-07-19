package Interview;

import java.util.Scanner;

public class Pra14 {

//	設計一程式，提示使用者輸入計程車里程，並計算費用後顯示於螢幕。里程計算方法如下:
//		里程(公尺)              費用
//		<1500                       70元
//		>1500           每多500公尺+5元
//		*不足500公尺以500公尺計算
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入里程: ");
		int mile = scanner.nextInt();
		int start = 70;
//		int count = 0;
		
		if( mile < 1500) {
			System.out.println(start);
		}
		else {
			int total = (mile-1500);
			if(total % 500 == 0) {
				System.out.println((total/500)*5+start);
			}
			else {
				System.out.println((total/500)*5+start+5);
			}
		}

	}

}
