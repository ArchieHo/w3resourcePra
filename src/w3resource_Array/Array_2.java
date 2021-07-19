package w3resource_Array;

public class Array_2 {

//	 2. Write a Java program to sum values of an array.
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5};
		int sum = 0;
		
		for(int i = 0;i<num.length;i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);
		
		
	}

}
