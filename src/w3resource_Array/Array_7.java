package w3resource_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_7 {

//	 7. Write a Java program to remove a specific element from an array.
	
	public static void main(String[] args) {
		
		int[] num = {2,5,6,7,23,5,77,456,67,89};
		System.out.println(Arrays.toString(num));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入要刪除的數字對應的索引值:");
		int del = scan.nextInt();
		
		for(int a = del;a < num.length-1;a++) {
			num[a] = num[a+1];
		}
		System.out.println(Arrays.toString(num));
		scan.close();
	}

}
