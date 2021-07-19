package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_18 {

//	18. Write a Java program to test an array list is empty or not
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		System.out.println(color);
		if(color.size() == 0) {
			System.out.println("This array list is empty.");
		}
		else {
			System.out.println("This array list is not empty.");
		}
	}	
}


