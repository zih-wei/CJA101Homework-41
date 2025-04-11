package hw5;
/*
用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
可以找出二維陣列的最大值並回傳
*/

public class hw5_3 {
	
	public static void main(String[] args) {
	
		int [][] intArray = {{1, 6 , 3},{9, 5, 2}};
		double [][] doubleArray = {{1.2, 3.5 , 2.2},{7.4, 2.1, 8.2}};
		
		hw5_3 w = new hw5_3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
	}
	
	public int maxElement(int intArray[][]) {
		
		int max = intArray[0][0];
		for (int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				if(intArray[i][j] > max) {
					max = intArray[i][j];
				}
			}
		}
		return max;
	}
	
	public double maxElement(double doubleArray[][]) {
		
		double max = doubleArray[0][0];
		for (int i = 0; i < doubleArray.length; i++) {
			for(int j = 0; j < doubleArray[i].length; j++) {
				if(doubleArray[i][j] > max) {
					max = doubleArray[i][j];
				}
			}
		}
		return max;
	}
}
