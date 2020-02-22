package assignments2;

import java.util.Scanner;

public class board_path {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int c = boardpath(0, n, "", m);
		System.out.println();
		System.out.print(c);
	}
	public static int boardpath(int curr, int end, String ans, int face) {
		if (curr == end) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int c = 0;
		for (int dice = 1; dice <= face; dice++) {
			c += boardpath(curr + dice, end, ans + dice, face);
		}
		return c;
	}
}
