
/*請寫一個程式，用陣列儲存使用者輸入的 n 個整數，透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。

 * Date: 2016/11/14
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float data[] = new float[n];
		float sum = 0;
		for (int i = 0; i < n; i++) {
			data[i] = scn.nextInt();
			sum = sum + data[i];
		}
		System.out.println(var(data, n, sum / n) / n);

	}

	public static float var(float[] data, int n, float sum) {
		// TODO Auto-generated method stub
		float sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum2 =(sum2 + (data[i] - sum) * (data[i] - sum));

		}
		return sum2;
	}

}
