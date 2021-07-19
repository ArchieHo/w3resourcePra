package Demo;

public class stu34 {
	
	public static void main(String[] args) {
		// 設定輸入的數字，使用int作為變數的型態
		int x = -96463453;
		
		// 判斷是否為負值，若為負值要先取絕對值
		if(x>0){			
			System.out.println(reverse(x));
		} else if(x < 0) {
			// 先取絕對值
			x = Math.abs(x);

			// 使用reverse函式，將反轉過後的數值轉為字元陣列
			char[] cTmp = reverse(x);

			// 將上方字元陣列轉為字串後，再將該字串轉為整數
			x = Integer.valueOf(String.copyValueOf(cTmp));

			// 將正整數轉為負值
			x = Math.negateExact(x);
			System.out.println(x);
		} else {

			// 如果不大於0，也不小於0，就直接列印出0
			System.out.println(0);
		}
	}
	
	/*
	*reverse函式輸入值為整數，回傳值為反轉後的字元陣列
	*/
	public static char[] reverse(int x){
		// 先將輸入值數字轉為字串
		String str = String.valueOf(x);

		// 將字串轉為字元陣列
		char[] cArray = str.toCharArray();

		// 宣告一個新的陣列，下方反轉後的字元將會放入此新陣列當中
		char[] cRet = new char[cArray.length];
		
		// 下方for迴圈，是將原本的數字，從最後方，也就是個位數字開始取
		// 然後依序將取出來的數字放入新的陣列cRet當中，從索引值0開始依序放入，如此就將原本的數字做反轉的動作
		int j = 0;
		for(int i = cArray.length-1; i>=0; i --){
			cRet[j] = cArray[i];
			j ++;
		}
		
		return cRet;
	}

}




