package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(gcd(m, n));
	}

	public static int gcd(int a, int b) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				sum = i;
			}
		}
		return sum;
	}
}
