package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_14 {

//	14. Write a Java program of swap two elements in an array list.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		System.out.println(color);
		
		for(String temp:color) {
			System.out.println(temp);
		}
		
		System.out.println("-----------------------");
		Collections.swap(color, 1, 3);
		for(String temp2:color) {
			System.out.println(temp2);
		}
	}	
}


