package w3resource_Array;

import java.util.Arrays;

public class Array_8 {

//	 8. Write a Java program to copy an array by iterating the array. 
	
	public static void main(String[] args) {
		
		int[] num = {2,5,6,7,23,5,77,456,67,89};
		System.out.println(Arrays.toString(num));
		int[] copynum = new int[10];
		for(int a = 0;a < num.length;a++) {
			copynum[a] = num[a];
		}
		System.out.println(Arrays.toString(copynum));
		
	}

}
