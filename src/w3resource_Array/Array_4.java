package w3resource_Array;

public class Array_4 {

//	 4. Write a Java program to calculate the average value of array elements.
	
	public static void main(String[] args) {
		
		int[] num = {2,5,6,7,23,5,77,456,67};
		int sum = 0;
		
		for(int a = 0;a < num.length;a++) {
			sum = sum + num[a];
		}
		int avg = sum/num.length;
		System.out.print("平均值為:" + avg);
		
	}

}
