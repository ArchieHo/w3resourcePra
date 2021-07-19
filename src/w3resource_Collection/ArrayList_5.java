package w3resource_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_5 {

//	5. Write a Java program to update specific array element by given element. 
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		color.add("Purple");
		color.set(3,"Red");
		System.out.print(color.get(3));
	}	
}