package w3resource_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_4 {

//	4. Write a Java program to retrieve an element (at a specified index) from a given array list.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		color.add("Purple");
		System.out.print(color.get(3));
	}	
}
