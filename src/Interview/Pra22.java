package Interview;

public class Pra22 {
	
//	判斷101-200之間有多少個素數，並輸出所有素數。 程式分析：判斷素數的方法：用一個數分別去除2到sqrt(這個數)，如果能被整除， 則表明此數不是素數，反之是素數。
//	質數(素數):除了1與本身以外沒有其他可以整除。
	public static void main(String[] args) {
		for(int a = 101;a < 200;a++) {
			for(int b = 2;b<=a;b++) {
				if(a % b == 0 && a != b) {
					break;
				}
				else if(a % b ==0 && a == b) {
					System.out.println(a);
				}
			}
		}
	}
}
