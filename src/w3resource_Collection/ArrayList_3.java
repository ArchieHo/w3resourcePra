package w3resource_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_3 {

//	3. Write a Java program to insert an element into the array list at the first position.
	
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
		
		color.add(0, "SuperWhite");
		color.add(1,"Red");
		System.out.println(color);
	}
}
