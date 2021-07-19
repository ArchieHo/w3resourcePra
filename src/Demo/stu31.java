package Demo;

public class stu31 {
	
	public static void main(String args[]){
		stu31 run = new stu31();
		System.out.println(run.couBMI(1.78, 72));
		
	}
	
	public double couBMI(double hight,double weight) {
		
		double BMI = weight/Math.pow(hight,2);
		
		return BMI;
	}
	

}
