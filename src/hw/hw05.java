package hw;

import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));
	}

	public static String fun(int a) {
		if (a < 10) {
			return Integer.toString(a);
		} else {
			return Integer.toString(a % 10) + fun(a / 10);
		}
	}

}