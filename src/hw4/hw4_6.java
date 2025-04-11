package hw4;
/*
• 班上有8位同學,他們進行了6次考試結果如下:
請算出每位同學考最高分的次數
(提示:二維陣列)
*/

public class hw4_6 {
	
	public static void main(String[] args) {
		
		int [][]grade = {
			{10,35,40,100,90,85,75,70},
			{37,75,77,89,64,75,70,95},
			{100,70,79,90,75,70,79,90},
			{77,95,70,89,60,75,85,89},
			{98,70,89,90,75,90,89,90},
			{90,80,100,75,50,20,99,75}
		};
		
		int times[] = {0,0,0,0,0,0,0,0};
		int maxGrade = 0;
		int	maxStudent = 0;
		for (int i = 0; i < grade.length; i++ ) {
			maxGrade = grade[i][0];
			maxStudent = 0;
			for(int j = 1; j < grade[0].length; j++) {
				if(maxGrade < grade[i][j]) {
					maxGrade = grade[i][j];
					maxStudent = j;
				}
			}
			times[maxStudent]++;
		}
		System.out.println("每位同學考最高分的次數:");
		for(int k = 0; k < grade[0].length; k++) {
			System.out.printf("%d號:%d次\n", k+1, times[k]);
		}
	}
}
