package Interview;

import java.util.Scanner;

//請設計一個程式，要求使用者重複輸入整數數值(數值可能為正數也可能為負數，並無特定範圍)，直到輸入0為止，
//計算並印出這些整數中的最大值、最小值以及它們的平均值至小數點第1位，如果一剛開始輸入0，則輸出沒有結果。
public class Pra4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入數字，輸入0結束:");
		double num = scanner.nextDouble();
		double count = 0;
		double sum = 0;
		double max = num;
		double min = num;
		
		while(num == 0) {
			break;
		}
		
		while(num != 0) {
			if(num > max) {
				max = num;
			}
			else if(num < min) {
				min = num;
			}
			sum = sum + num;
			count = count + 1;
			System.out.println("請輸入數字，輸入0結束:");
			num = scanner.nextDouble();
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Avg: " + (sum / count));
		scanner.close();
	}
}
