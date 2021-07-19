package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_16 {

//	16. Write a Java program to clone an array list to another array list.
	
	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		System.out.println(color);
		ArrayList<String> newcolor = (ArrayList<String>)color.clone();
        System.out.println("Cloned array list: " + newcolor); 
	}	
}


