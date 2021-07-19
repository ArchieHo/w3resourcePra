package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_10 {

//	10. Write a Java program to shuffle elements in a array list.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		System.out.println(color);
		
		Collections.shuffle(color);
		System.out.println(color);
	}	
}


