package coversions;

import java.util.Scanner;

public class any_to_any {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int n = scn.nextInt();
		int i = 1, rem = 0, multi = 1, ans = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			ans = rem * multi + ans;
			multi = multi * sb;
		}
		int ans2=0;
		i = 1; rem = 0; multi = 1;
		while (ans != 0) {
			rem = ans % db;
			ans = ans / db;
			ans2 = rem * multi + ans2;
			multi = multi * 10;
		}
		System.out.println(ans2);
		
}}
