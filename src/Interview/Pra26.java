package Interview;

import java.util.Scanner;

public class Pra26 {

//	輸入一行字元，分別統計出其中英文字母、空格、數字和其它字元的個數。
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入一行文字:");
		String str = scan.nextLine();
		char[] temp = str.toCharArray();
		int word = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0;i < temp.length;i++) {
			if(Character.isLetter(temp[i])) {
				word++;
			}
			else if(Character.isSpace(temp[i])) {
				space++;
			}
			else if(Character.isDigit(temp[i])) {
				num++;
			}
			else {
				other++;
			}
		}
		System.out.printf("%s個文字,%s個空白,%s個數字,%s個其他的符號",word,space,num,other);
		scan.close();
	}

}
