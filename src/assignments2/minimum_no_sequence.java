package assignments2;

import java.util.Scanner;

public class minimum_no_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//		char[][] arr = new char[n][];

		for (int i = 0; i < n; i++) {
			String str = scn.next();
			sequence(str);
		}
//		sequence("IDDDI");
	}

	public static void sequence(String str) {
		int[] ans = new int[str.length() + 1];
		int count = 1;
		for (int i = 0; i < str.length(); i++) {

			if (i + 1 == str.length() && str.charAt(i) == 'D') {
				ans[i + 1] = count;
				count++;
			}

			if (str.charAt(i) == 'I' || i + 1 == str.length()) {
				int j = i - 1;
				ans[i] = count;
				count++;
				if (j >= 0 && str.charAt(j) == 'D') {
					while (j >= 0 && str.charAt(j) != 'I') {
						ans[j] = count;
						count++;
						j--;
					}
				}
			}
		}
		if (ans[str.length()] == 0) {
			ans[str.length()] = count;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] );
		}
		System.out.println();
	}
}
