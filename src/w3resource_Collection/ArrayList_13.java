package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_13 {

//	13. Write a Java program to compare two array lists.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		System.out.println(color);
		
		List<String> color_2 = new ArrayList<String>();
		color_2.add("White");
		color_2.add("Red");
		color_2.add("Green");
		color_2.add("Black");
		System.out.println(color_2);
		
		List<String> color_3 = new ArrayList<String>();
		for(String str:color) {
			color_3.add(color_2.contains(str)? "Yes" : "No");
		}
		System.out.println(color_3);
	}	
}


