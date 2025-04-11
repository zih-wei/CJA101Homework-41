package hw1;

public class hw1 {

	/*
	• 請設計一隻Java程式,計算12,6這兩個數值的和與積
	• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
	金加利息共有多少錢 (用複利計算,公式請自行google)
	• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
	5 + 5
	5 + ‘5’
	5 + “5”
	並請用註解各別說明答案的產生原因	
	*/
	public static void main(String[] args) {
	
	int num1 = 12, num2 = 6;
	System.out.println("和:" + num1 + num2);
	System.out.println("積:" + num1 * num2);
	System.out.println("==============================");
	
	int num3 = 200, num4 = 12;
	System.out.println(num3 / num4 + "打" + num3 % num4 + "顆");	
	System.out.println("==============================");
	
	int num5 = 256559;
	int days = num5/(60*60*24);
	
	num5 = num5%(60*60*24);
	int hours = num5/(60*60);	
	
	num5 = num5%(60*60);
	int mins = num5/60;
	int	secs = num5%60;
			
	System.out.println( days + "天" + hours + "小時" + mins + "分" + secs + "秒");	
	System.out.println("==============================");

	double pi = 3.1415;		
	System.out.println("圓面積:" + 5 * 5 * pi );
	System.out.println("圓周長:" + 5 * 2 * pi );
	System.out.println("==============================");
	
	int num6 = 1500000;
	System.out.println("本金加利息共:" + num6*Math.pow(1.02, 10) );
	System.out.println("==============================");
	
	System.out.println(5 + 5);   // 10, 數字相加
	System.out.println(5 + '5'); // 58, 字元'5' unicode 為53
	System.out.println(5 + "5"); // 55, 先印數字5再印字串5
	
	}
}
