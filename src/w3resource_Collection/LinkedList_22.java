package w3resource_Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList_22 {

//	22. Write a Java program to check if a particular element exists in a linked list.
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		
		if(student.contains("Archie")) {
			System.out.println("有此資料");
		}
		else {
			System.out.println("無此資料");
		}
		
	}

}
