package Interview;

import java.util.Scanner;

public class Pra27 {

//	求s=a aa aaa aaaa aa…a的值， 其中a是一個數字。例如2 22 222 2222 22222(此時共有5個數相加)，幾個數相加有鍵盤控制。
	未解
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字：");
		int number = sc.nextInt();
		int s = 0;
		for(int i=number;i>0;i--){
		s =(int) (i * number * Math.pow(10, (number - i)));
		}
		System.out.println("s=" + s);
		}
}
