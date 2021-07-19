package w3resource_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_6 {

//	6. Write a Java program to remove the third element from a array list. 
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		color.add("Purple");
		
		color.remove(3);
		System.out.print(color);
	}	
}