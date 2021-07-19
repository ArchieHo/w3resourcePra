package Interview;

import java.util.Scanner;

//設計一程式，在任意個n個分數(0~100)，計算並顯示它們的最高分、第二高分。
//	(不可直接使用sort函式)

public class Pra2 {
	
	public static void main(String[] args) 
	 {
	  Scanner input = new Scanner(System.in);
	  
	  //提示使用者輸入
	  System.out.println("請輸入人數:");
	  double number = input.nextDouble();
	  System.out.println("請輸入分數:");
	  double score = input.nextDouble();
	  
	  double count = 1;
	  //剛開始輸入的分數同時是最大也會是第二大
	  double first = score ;
	  double second = score;
	  
	  //輸入並計算結果
	  while(count < number)
	  {
	   System.out.println("請輸入分數:");
	   score = input.nextDouble();
	   
	   count = count + 1;
	   
	   if (score > first && count == 2 )
	   {
	    first = score;    
	   }
	   else if (score < first && count == 2 )
	   {
	    second = score;    
	   }
	   else if(score >= first && count > 2 )
	   {
	    first = score;
	   }   
	   else if(score >= second  && score <= first && count > 2)
	   {
	    second = score;
	   } 
	  }
	  
	  //輸出結果
	  System.out.println("最高分:" + first);
	  System.out.println("第二高分:" + second);  
	 }
}
