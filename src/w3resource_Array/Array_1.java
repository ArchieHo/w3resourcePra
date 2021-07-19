package w3resource_Array;

import java.util.Arrays;

public class Array_1 {

//	 1. Write a Java program to sort a numeric array and a string array
	
	public static void main(String[] args) {
		
		int[] num = {12,23,35,56,33,56,446,23};
		String[] str = {"ds","wd","adx","zcv","qlk","ldie"};
		
		System.out.println("Original numeric array : "+Arrays.toString(num));
	    Arrays.sort(num);
	    System.out.println("Sorted numeric array : "+Arrays.toString(num));
	    
	    System.out.println("Original string array : "+Arrays.toString(str));
	    Arrays.sort(str);
	    System.out.println("Sorted string array : "+Arrays.toString(str));
		
	}

}
