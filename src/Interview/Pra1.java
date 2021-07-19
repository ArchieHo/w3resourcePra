package Interview;

public class Pra1 {

	//	設計一程式，程式以倒序輸出該串文字
//	例如輸入123456789時輸出987654321,輸入abcd時輸出dcba

	public static void main(String[] args) {
		String str = "123456789";
		
		char[] ch = str.toCharArray();
		int end = ch.length-1;
		for(int i = end;i>=0;i--) {
			
			System.out.print(ch[i]);
		}
	}

}
