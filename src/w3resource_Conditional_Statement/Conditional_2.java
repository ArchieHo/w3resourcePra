package w3resource_Conditional_Statement;

import java.util.Scanner;

public class Conditional_2 {

//	2. Write a Java program to solve quadratic equations (use if, else if and else).
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入a,b,c三數");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double result = b*b-(4*a*c);
		
		if(result > 0.0) {
			double re1 = (-b + Math.pow(result, 0.5))/2.0*a;
			double re2 = (-b - Math.pow(result, 0.5))/2.0*a;
			System.out.println("Root:" + re1);
			System.out.println("Root:" + re2);
		}
		else if(result == 0.0) {
			double re1 = -b/(2.0*a);
			System.out.println("Root:" + re1);
		}
		else {
			System.out.println("不是");
		}
		
	}

}
