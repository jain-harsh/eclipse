package dynamic_processing;

import java.util.Arrays;
import java.util.Scanner;

public class lowest_count_string {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		LCS(s1, s2);
		int[][] arr = new int[s1.length()+1][s2.length()+1];
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], -1);
		}
		System.out.println(LCSTD(s1, s2, arr));
//	LCSBD(s1,s2);
	}

	private static void LCSBD(String s1, String s2) {
		int[][] arr = new int[s1.length() + 1][s2.length() + 1];
		for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = s2.length() - 1; j >= 0; j--) {
				char ch1 = s1.charAt(i);
				char ch2 = s2.charAt(j);
				if (ch1 == ch2) {
					arr[i][j] = arr[i + 1][j + 1] + 1;
				} else {
					arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
				}
			}
		}
		System.out.println(arr[0][0]);

	}

	private static int LCSTD(String s1, String s2, int[][] arr) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (arr[s1.length()][s2.length()] != -1) {
			return arr[s1.length()][s2.length()];
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCSTD(ros1, ros2, arr) + 1;
		} else {
			int o1 = LCSTD(s1, ros2, arr);
			int o2 = LCSTD(ros1, s2, arr);

			ans = Math.max(o1, o2);
		}
		arr[s1.length()][s2.length()] = ans;

		return ans;

	}

	public static int LCS(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int o1 = LCS(s1, ros2);
			int o2 = LCS(ros1, s2);

			ans = Math.max(o1, o2);
		}

		return ans;

	}
}
