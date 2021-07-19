package Demo;

public class stu36 {
	
	public static void main(String args[]) {
		
		double quietHeart = 65;
		double heartbeat = 0;
		double strength = 0.65;
		double age = 26; 
		
		do {
			heartbeat = (((220-age)-quietHeart)*strength+quietHeart);
			strength = strength + 0.05;
			System.out.println(heartbeat);
		}while(strength < 1.00);
		
//		while(strength <= 0.95) {
//			heartbeat = (((220-age)-quietHeart)*strength+quietHeart);
//			strength = strength + 0.05;
//			System.out.println(heartbeat);
//		}
	}

}
