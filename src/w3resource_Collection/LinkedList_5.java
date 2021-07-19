package w3resource_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_5 {

//	5. Write a Java program to insert the specified element at the specified position in the linked list. 
	
	public static void main(String[] args) {
		

		LinkedList<String> student = new LinkedList<String>();
		student.add("Archie");
		student.add("Carol");
		student.add("Dave");
		student.add("Mei");
		System.out.println(student);
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入要加入的索引位置:");
		int n = scan.nextInt();
		System.out.println("請輸入名字:");
		String str = scan.next();
		
		student.add(n,str);
		System.out.println(student);
	}

}
