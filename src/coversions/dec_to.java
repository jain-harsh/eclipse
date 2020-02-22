package coversions;

import java.util.Scanner;

public class dec_to {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sb = scn.nextInt();
		int i = 1, rem = 0, multi = 1, ans = 0;
		while (n != 0) {
			rem = n % sb;
			n = n / sb;
			ans = rem * multi + ans;
			multi = multi * 10;
		}
		System.out.println(ans);
	}
}
