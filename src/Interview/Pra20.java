package Interview;

import java.util.Scanner;

public class Pra20 {

//	設計一程式，提示使用者輸入n個整數，計算並於螢幕顯示它們的最小值，以及最小值總共出現的次數。
	未解
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		  
		  //提示使用者輸入
		  System.out.println("即將輸入數字個數n:");
		  int total = input.nextInt();
		  System.out.println("請輸入數字:");
		  int number = input.nextInt();
		  int min = number;
		  int mincount = 1;
		  
		  //比較並記錄結果
		  for(int i = 2 ; i <= total ; i++)
		  {
		   System.out.println("請輸入數字:");
		   number = input.nextInt();   
		   
		   if(number < min)
		   {
		    min = number;
		    mincount = 1;
		   }
		   else if(number == min)
		   {
		    min = number;
		    mincount = mincount + 1;      
		   }     
		  }
		  
		  //印出結果
		  System.out.println("最小值為:" + min );
		  System.out.println("最小值出現次數:" + mincount);
		  input.close();
		 }

	}


