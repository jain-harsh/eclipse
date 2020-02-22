package coversions;

import java.util.Scanner;

public class any_to_decimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sb = scn.nextInt();
		int i = 1, rem = 0, multi = 1, ans = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			ans = rem * multi + ans;
			multi = multi * sb;
		}
		System.out.println(ans);
	}

}
