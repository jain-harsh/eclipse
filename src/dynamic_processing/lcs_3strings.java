package dynamic_processing;

import java.util.Scanner;

public class lcs_3strings {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		String s3 = scn.next();
		System.out.println(lcs(s1, s2, s3));
	}

	private static int lcs(String s1, String s2, String s3) {
		if (s1.length() == 0 || s2.length() == 0 || s3.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		char ch3 = s3.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		String ros3 = s3.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			if (ch2 == ch3) {
				ans = lcs(ros1, ros2, ros3) + 1;
			} else {
				int o1 = lcs(ros1, ros2, s3);
				int o2 = lcs(s1, s2, ros3);
				ans = Math.max(o1, o2);
			}
		} else if (ch2 == ch3) {
			int o1 = lcs(s1, ros2, ros3);
			int o2 = lcs(ros1, s2, s3);
			ans = Math.max(o1, o2);
		} else if (ch1 == ch3) {
			int o1 = lcs(ros1, s2,ros3);
			int o2 = lcs(s1, ros2, s3);
			ans = Math.max(o1, o2);
		} else {
			int o1 = lcs(ros1, s2, s3);
			int o2 = lcs(s1, ros2, s3);
			int o3 = lcs(s1, s2, ros3);
			ans = Math.max(o1, Math.max(o2, o3));
		}
		return ans;
	}

}
