package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_15 {

//	15. Write a Java program to join two array lists.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		System.out.println(color);
		
		List<String> color_2 = new ArrayList<String>();
		color_2.add("白");
		color_2.add("紅");
		color_2.add("黑");
		color_2.add("黃");
		color_2.add("粉");
		System.out.println(color_2);
		
		for(String temp:color_2) {
			color.add(temp);
		}
		System.out.println(color);
	}	
}


