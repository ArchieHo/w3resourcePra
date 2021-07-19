package Interview;

import java.util.Arrays;
import java.util.Scanner;

//編寫程式將由數字及字元組成的字串中的數字截取出來並按順序輸出,例如:“ABC137GMNQQ2049PN5FFF”輸出結果應該為01234579。

public class X {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一個字串");
		String str = scan.next();
		char[] num1 = str.toCharArray();
		char[] num2 = new char[str.length()];
		int count = 0;
		
		for(int a = 0;a < str.length();a++) {
			if(num1[a] >='0' && num1[a] <='9') {
				num2[count++] = num1[a];
			}
		}
		Arrays.sort(num2);
		for(int a = 0;a < num2.length;a++){
			System.out.print(num2[a]);
		}
		scan.close();
	}
}
