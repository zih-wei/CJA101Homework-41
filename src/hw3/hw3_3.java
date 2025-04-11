package hw3;
/*
阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
的號碼與總數,如圖:

(提示:Scanner)
(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
*/
import java.util.Scanner;

public class hw3_3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int x = scanner.nextInt();
		
		
		int []randomSix = new int [6];
		
		for (int i = 0; i < randomSix.length; i++) {
			randomSix[i] = (int)(Math.random()*49) + 1 ;
			if (x != randomSix[i] && x != randomSix[i]%10 ) {		
				System.out.println(randomSix[i]);
			} else {
					
			}
		}
		scanner.close();
	}
}
