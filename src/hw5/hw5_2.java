package hw5;
// 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class hw5_2 {
	
	public static void main(String[] args) {
		
		randAvg();
	}
	
	public static void randAvg() {
		
		System.out.println("本次亂數結果:");
		int arr[] = new int [10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		double x = sum/arr.length;
		System.out.println("\n平均值" + x);
		
		
	}
}
