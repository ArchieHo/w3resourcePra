package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_9 {

//	9. Write a Java program to copy one array list into another.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		System.out.println(color);
		
		List<String> number = new ArrayList<String>();
		number.add("1");
		number.add("4");
		number.add("3");
		number.add("9");
		System.out.println(number);
		Collections.copy(number,color);
		System.out.println(number);
		System.out.println(color);
	}	
}


