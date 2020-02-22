package assignments;

import java.util.Scanner;

public class dec_to_octal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		int i = 1, rem = 0, multi = 1, ans = 0;
		while (n != 0) {
			rem = n % 8;
			n = n / 8;
			ans = rem * multi + ans;
			multi = multi * 10;
		}
		System.out.println(ans);
	}

}
