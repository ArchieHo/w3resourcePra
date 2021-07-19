package w3resource_Array;

public class Array_6 {

//	 6. Write a Java program to find the index of an array element.
	public static int ind(int[] arr,int n) {
		
		return arr[n];
	}
	
	
	public static void main(String[] args) {
		
		int[] num = {2,5,6,7,23,5,77,456,67};
		
		System.out.println(ind(num,9));
		
	}

}
