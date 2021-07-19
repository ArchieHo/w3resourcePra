package w3resource_Conditional_Statement;

public class Conditional_25 {

//	25. Write a Java program to display the number rhombus structure 
	
//      1                                                  
//     212                                                 
//    32123                                                
//   4321234                                               
//  543212345                                              
// 65432123456                                             
//7654321234567                                            
// 65432123456                                             
//  543212345                                              
//   4321234                                               
//    32123                                                
//     212                                                 
//      1   
	
	public static void main(String[] args) {
		
		for(int a = 1;a <= 7;a++) {
			for(int b = 7;b > a;b--) {
				System.out.print(" ");
			}
			for(int c = 1;c <= b;c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}




