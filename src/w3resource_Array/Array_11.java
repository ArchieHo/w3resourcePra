package w3resource_Array;

import java.util.Arrays;

public class Array_11 {

//	 11. Write a Java program to reverse an array of integer values.  
	public static void main(String[] args) {
		int[] arr = {23,46,567,4,5546,234};
		int temp;
		
		for(int a =0;a < arr.length/2;a++) {
			temp = arr[a];
			arr[a] = arr[arr.length-a-1];
			arr[arr.length-a-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
