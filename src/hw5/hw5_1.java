package hw5;
// 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

import java.util.Scanner;

public class hw5_1 {
	
	public static void main(String[] args) {
		
		System.out.println("請輸入寬與高:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();	
		for(int i = 0; i < y; i++) {		
			for(int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		scanner.close();
	}
}
