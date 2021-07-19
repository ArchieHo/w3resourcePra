package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_8 {

//	8. Write a Java program to sort a given array list. 
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		color.add("Purple");
		System.out.println(color);
		Collections.sort(color);
		System.out.println(color);
	}	
}