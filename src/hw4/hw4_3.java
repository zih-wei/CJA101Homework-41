package hw4;
/*
 有個字串陣列如下 (八大行星):
{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
(提示:字元比對,String方法)
*/
public class hw4_3 {

	public static void main(String[] args) {
	
		String []arr = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String vowels = "aeiou";
		int countvowels = 0;
			
		for (int i = 0; i < arr.length; i++) {
			String planet = arr[i];
			
			for (int j = 0; j < planet.length(); j++) {
				char ch = planet.charAt(j);
				if (vowels.indexOf(ch) != -1)
					countvowels++;
			}
			
		}
		System.out.println("陣列裡面共有" + countvowels + "個母音");
	}
}
