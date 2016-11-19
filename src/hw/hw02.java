package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));
	}

	public static int fun(int a) {
		int sum = 0;
		while (a > 0) {
			a = a / 10;
			sum = sum + 1;
		}
		return sum;
	}
}
