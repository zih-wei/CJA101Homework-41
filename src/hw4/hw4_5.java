package hw4;
/*
• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
(提示1:Scanner,陣列)
(提示2:需將閏年條件加入)
(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
*/

import java.util.Scanner;

public class hw4_5 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入三個整數,分別代表西元yyyy年,mm月,dd日:");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int date = scanner.nextInt();
		
		boolean isLeap = true;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			isLeap = true;
		}else {
			isLeap = false;
		}
		
		int monthDays[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeap) {
			monthDays[2] += 1;
		}
		
		if(date > monthDays[month]) {
			System.out.println("錯誤輸入");
			return;
		}
		
		int count = 0;
		for (int i = 1; i < month; i++) {
			count += monthDays[i];
		}
		count += date;
		System.out.println("輸入的日期為該年第" + count + "天");
		scanner.close();
	}
}
