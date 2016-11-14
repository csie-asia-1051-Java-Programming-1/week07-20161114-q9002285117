import java.util.Scanner;
/*承上題，除了var() 函數之外，再用建立一個 std() 函數，程式在接收完使用者輸入的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，主程式再把結果印出。
 * Date: 2016/11/14
 * Author: 105021038 傅琬鈞
 */
public class ex2 {

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
		System.out.println(std(var(data, n, sum / n) / n));
	}

	public static int var(float[] data, int n, float sum) {
		// TODO Auto-generated method stub
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum2 = (int) (sum2 + (data[i] - sum) * (data[i] - sum));

		}
		return sum2;
	}

public static double std(int p){
	return Math.sqrt(p);
}}