package w3resource_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_9 {

//	 9. Write a Java program to insert an element (specific position) into an array. 

	public static void main(String[] args) {
		
		int[] num = {2,5,6,7,23,5,77,456,67,89};
		System.out.println("目前陣列為:" + Arrays.toString(num));
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入索引值:");
		int ind = scan.nextInt();
		System.out.println("輸入值:");
		int ele = scan.nextInt();
		
		num[ind] = ele;
		System.out.println("更改後為:" + Arrays.toString(num));
		scan.close();
	}

}
