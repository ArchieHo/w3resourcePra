package w3resource_Array;

public class Array_5 {

//	 5. Write a Java program to test if an array contains a specific value.
	public static boolean contain(int[] arr,int n) {
		for(int a : arr) {
			if(a == n) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		int[] num = {2,5,6,7,23,5,77,456,67};
		
		System.out.println(contain(num,456));
		System.out.println(contain(num,3));
		
	}

}
