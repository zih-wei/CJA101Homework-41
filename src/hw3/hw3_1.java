package hw3;
/*
請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
三角形、其它三角形或不是三角形,如圖示結果:

(提示:Scanner,三角形成立條件,判斷式if else)
(進階功能:加入直角三角形的判斷)
*/

import java.util.Scanner;
import java.util.Arrays;

public class hw3_1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);		
		int []lengthOfSide = new int [3];		
		System.out.println("請輸入三個整數:");		
		for (int i = 0; i <= 2; i++) {		
			lengthOfSide[i] = scanner.nextInt();
		}
		Arrays.sort(lengthOfSide);
		System.out.println( lengthOfSide[0] +" " + lengthOfSide[1] +" " + lengthOfSide[2]);
		
		if (lengthOfSide[0] + lengthOfSide[1] <= lengthOfSide[2] || lengthOfSide[0] <= 0  ) {
			System.out.println("不是三角形");
		}else if (lengthOfSide[0] == lengthOfSide[1] && lengthOfSide[1] == lengthOfSide[2]) {
			System.out.println("正三角形");
		}else if (lengthOfSide[0] == lengthOfSide[1] || lengthOfSide[1] == lengthOfSide[2]) {
			System.out.println("等腰三角形");
		}else if (lengthOfSide[2]*lengthOfSide[2] == lengthOfSide[0]*lengthOfSide[0] + lengthOfSide[1]*lengthOfSide[1] ) {	
			System.out.println("直角三角形");
		}else{	
			System.out.println("其它三角形");
		}	
		scanner.close();
	}
	
}
