package hw4;
/*
請建立一個字串,經過程式執行後,輸入結果是反過來的
例如String s = “Hello World”,執行結果即為dlroW olleH
(提示:String方法,陣列)
*/
public class hw4_2 {

	public static void main(String[] args) {
	
		String s = "Hello World";
		char [] arr = s.toCharArray();		
		for ( int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]);
		}
	}
}
