package hw4;
/*
• 有個一維陣列如下:
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
(提示:陣列,length屬性)
*/

public class hw4_1 {
	
	public static void main(String[] args) {
		
		int []x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];			
		}
		double average = sum/(double)x.length;
		System.out.println("陣列元素的平均值 : " + average);
		System.out.print("陣列元素大於平均值的元素 : ");
		for (int i = 0; i < x.length; i++) {
			 if (x[i] > average) {	
				 System.out.print(x[i]+" ");
			 }
		}
	}
}
