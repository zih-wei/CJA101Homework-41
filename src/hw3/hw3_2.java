package hw3;
/*
請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
對則顯示正確訊息,如圖示結果:

(提示:Scanner,亂數方法,無窮迴圈)
(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
*/
import java.util.Scanner;

public class hw3_2 {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);			
		System.out.println("開始猜數字吧!");
		int userQuess = scanner.nextInt();
		int x = (int)(Math.random()*101);
		
		while (x != userQuess) {			
			userQuess = scanner.nextInt();
			
			if (x > userQuess) {
				System.out.println("猜錯了,小於正確答案");	
			} else if (x < userQuess) {
				System.out.println("猜錯了,大於正確答案");		
			} else  {
				System.out.println("答對了!答案就是"+ x);
			}
		}
		scanner.close();
	}
}
