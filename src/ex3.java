import java.util.Scanner;
/*請寫一個程式，讓使用者輸入一個整數二維陣列，建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，並把結果回傳到主程式印出。
 * Date: 2016/11/14
 * Author: 105021038 傅琬鈞
 */
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int data[][] = new int[n][n];
		float sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				data[i][j] = scn.nextInt();
				sum = sum + data[i][j];
			}

		}
		System.out.println(var2(data, n, sum / (n * n)) / (n * n));
		System.out.println(std2(var2(data, n, sum / (n * n)) / (n * n)));
	}

	public static float var2(int[][] data, int n, float sum) {
		// TODO Auto-generated method stub
		float sum2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum2 = (float) (sum2 + (data[i][j] - sum) * (data[i][j] - sum));
			}
		}
		return sum2;
	}

	public static double std2(float p) {
		return Math.sqrt(p);
	}
}