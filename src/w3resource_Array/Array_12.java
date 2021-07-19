package w3resource_Array;

import java.util.Arrays;

public class Array_12 {

//	 12.Write a Java program to find the duplicate values of an array of integer values.
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		
		for(int a = 0;a <= arr.length-1;a++) {
			for(int b = a+1;b <= arr.length-1;b++) {
				if(arr[a] == arr[b]) {
					System.out.println(arr[b]);
				}
			}
		}
		
	}
}
