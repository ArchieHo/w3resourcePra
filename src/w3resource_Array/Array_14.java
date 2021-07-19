package w3resource_Array;

import java.util.Arrays;

public class Array_14 {

//	14. Write a Java program to find the common elements between two arrays (string values).
	public static void main(String[] args) {
		String[] str = {"archie","mei","carol","dddd","aaaa","gggg"};
		String[] str_2= {"archie","carol","marc","haha","dave","aaaa"};
		
		for(int a = 0;a < str.length;a++) {
			for(int b = 0;b < str_2.length;b++) {
				if(str[a].equals(str_2[b])) {
					System.out.println(str_2[b]);
				}
			}
		}
		
	}
}
