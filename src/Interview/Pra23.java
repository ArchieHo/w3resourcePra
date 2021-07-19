package Interview;

public class Pra23 {

//	列印出所有的 “水仙花數 “， 所謂 “水仙花數 “是指一個三位數， 其各位數字立方和等於該數本身。例如：153是一個 “水仙花數 “，因為153=1的三次方＋5的三次方＋3的三次方。
	
	public static void main(String[] args) {
		
		
		for(int a = 100;a < 1000;a++) {
			int temp1 = (a/100)*(a/100)*(a/100);
			int temp2 = (a%100/10)*(a%100/10)*(a%100/10);
			int temp3 = (a%100%10)*(a%100%10)*(a%100%10);
			int num = temp1 + temp2 + temp3;
			if(a == num) {
				System.out.printf("%s是一個 水仙花數\n",a);
			}
		}

	}

}
