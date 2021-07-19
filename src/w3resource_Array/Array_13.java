package w3resource_Array;

import java.util.Arrays;

public class Array_13 {

//	 13. Write a Java program to find the duplicate values of an array of string values.
	public static void main(String[] args) {
		String[] str = {"archie","carol","dave","archie","carol","mei"};
		
		for(int a = 0;a < str.length-1;a++) {
			for(int b = a+1;b < str.length-1;b++) {
				if(str[a].equals(str[b])) {
					System.out.println(str[b]);
				}
			}
		}
		
	}
}
