package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		System.out.println(lcm(x, y, z));
	}

	public static int lcm(int a, int b, int c) {
		int sum = 1;
		while (true) {
			if (sum % a == 0 && sum % b == 0 && sum % c == 0) {
				break;
			} else {
				sum = sum + 1;
			}
		}
		return sum;

	}
}