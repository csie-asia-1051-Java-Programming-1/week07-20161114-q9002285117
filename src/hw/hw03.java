package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(C(m, n));
	}

	public static float C(int a, int b) {
		int sum1 = 1, sum2 = 1, sum3 = 1, c = a - b;
		for (int i = 1; i <= a; i++) {
			sum1 = sum1 * i;
		}
		for (int i = 1; i <= b; i++) {
			sum2 = sum2 * i;
		}
		for (int i = 1; i <= c; i++) {
			sum3 = sum3 * i;
		}
		return sum1 / (sum2 * sum3);
	}
}
