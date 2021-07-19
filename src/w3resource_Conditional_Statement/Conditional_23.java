package w3resource_Conditional_Statement;

public class Conditional_23 {

//	23. Write a java program to generate a following *'s triangle.
	
//******                                                   
// *****                                                   
//  ****                                                   
//	 ***                                                   
//	  **                                                   
//	   * 
	
	public static void main(String[] args) {
		
		for(int a =1;a <=6;a++) {
			for(int b=1;b < a;b++) {
				System.out.print(" ");
			}
			for(int c = 6;c >=a;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}




