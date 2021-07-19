package w3resource_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_11 {

//	11. Write a Java program to reverse elements in a array list.
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		color.add("White");
		color.add("Red");
		color.add("Black");
		color.add("Yellow");
		System.out.println(color);
		
//		Collections.reverse(color);
//		System.out.println(color);
		
		List<String> color_re = new ArrayList<String>();
		for(int a =color.size()-1;a >= 0 ;a--) {
			color_re.add(color.get(a));
		}
		System.out.print(color_re);
	}	
}


