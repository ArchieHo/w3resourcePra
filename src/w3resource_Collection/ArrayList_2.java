package w3resource_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

//	2. Write a Java program to iterate through all elements in a array list. 
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		color.add("Purple");
		for(String a:color) {
			System.out.println(a);		
		}
	}
}
