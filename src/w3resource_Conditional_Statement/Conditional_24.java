package w3resource_Conditional_Statement;

public class Conditional_24 {

//	24. Write a java program to generate a following @'s triangle. 
	
//     @                                                  
//    @@                                                  
//   @@@                                                  
//  @@@@                                                  
// @@@@@                                                  
//@@@@@@
	
	public static void main(String[] args) {
		
		for(int a = 1;a <= 6;a++) {
			for(int b = 5;b >= a;b--) {
				System.out.print(" ");
			}
			for(int c = 1;c <= a;c++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}




