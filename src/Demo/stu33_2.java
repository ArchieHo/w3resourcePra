package Demo;

public class stu33_2 {
	
	public static void main(String args[]) {
		
		int sum = 0;
		int[] array = {3,10,18,24};
//		for(int i = 0;i <= array.length-1;i++) { 方法一
//			sum += array[i];
//			
//		}
//		System.out.print(sum);
		
		for(int i:array) {
			sum += i;
		}
		System.out.print(sum);
	}
	

}
