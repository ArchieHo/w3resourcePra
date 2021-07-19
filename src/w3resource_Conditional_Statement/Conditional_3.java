package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_3 {

//	3. Take three numbers from the user and print the greatest number.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入a,b,c三數");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if(a > b && a > c) {
			System.out.println("Greatest number:" + a);
		}
		else if (b > a && b > c) {
			System.out.println("Greatest number:" + b);
		}
		else {
			System.out.println("Greatest number:" + c);
		}
	}

}
