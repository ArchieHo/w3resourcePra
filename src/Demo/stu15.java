package Demo;

public class stu15 {
	public static void main(String args[]) {
		
		double d = 3.14;
		String d1 = String.valueOf(d);
		float d2 = Float.parseFloat(d1);
		System.out.println(d2);
		
		Float d3 = new Float(d2);
		int d4 = d3.intValue();
		System.out.println(d4);
		
	}

}
