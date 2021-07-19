package Interview;

import java.util.Scanner;

public class Pra29 {

//	設計一程式，提示使用者輸入正整數n，印出第n個小寫英文字母。
//	例如:輸入1，印出a
	
	public static void main(String[] args) 
	 {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("please enter a number:");
	  int a = scan.nextInt();
	  
	  int b = a + 96;
	    
	  System.out.println("The answer of the question is:" + (char)b);
	  scan.close();
	 }

}
