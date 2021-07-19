package w3resource_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {

//	1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White, "+ "Black, "+ "Green, " + "Yellow");
		color.add("Pink");
		color.add("Purple");
		System.out.print(color);

	}

}
