package w3resource_Array;

import java.util.Arrays;

public class Array_15 {

//	15. Write a Java program to find the common elements between two arrays of integers.
	public static void main(String[] args) {
		int[] num = {123,456,789,23,435,676};
		int[] num_2= {123,756,346,878,676};
		
		for(int a = 0;a < num.length;a++) {
			for(int b = 0;b < num_2.length;b++) {
				if(num[a] == num_2[b]) {
					System.out.println(num_2[b]);
				}
			}
		}
		
	}
}
