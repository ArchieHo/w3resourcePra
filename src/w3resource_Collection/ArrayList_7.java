package w3resource_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_7 {

//	7. Write a Java program to search an element in a array list. 
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Black");
		color.add("Yellow");
		color.add("Pink");
		color.add("Purple");
		
		if(color.contains("White")) {
			System.out.println("有找到White");
		}
		else {
			System.out.println("沒找到White");
		}
	}	
}