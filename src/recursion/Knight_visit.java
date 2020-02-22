package recursion;

import java.util.Scanner;

public class Knight_visit {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		knight(new boolean[n][n], 0, 0, 0, n, "");
		System.out.println();
		System.out.println(count);
	}
	
	static int count;

	public static void knight(boolean[][] arr, int r, int c, int placed, int tk, String ans) {
		if (placed == tk) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (c == arr[0].length) {
			r++;
			c = 0;
		}
		if (r == arr.length) {
			return;
		}
		if (safe(arr, r, c)) {
			arr[r][c] = true;
			knight(arr, r, c + 1, placed + 1, tk, ans + "{" + r + "-" + c + "} ");
			arr[r][c] = false;
		}
		knight(arr, r, c + 1, placed, tk, ans);
	}

	public static boolean safe(boolean[][] arr, int row, int col) {
		int r = row - 2;
		int c = col - 1;
		if (r >= 0 && c >= 0 && r<arr.length && c<arr[0].length && arr[r][c]) {
			return false;
		}
		r = row - 1;
		c = col - 2;
		if (r >= 0 && c >= 0 && r<arr.length && c<arr[0].length && arr[r][c]) {
			return false;
		}
		r = row - 2;
		c = col + 1;
		if (r >= 0 && c >= 0 && r<arr.length && c<arr[0].length  && arr[r][c]) {
			return false;
		}
		r = row - 1;
		c = col + 2;
		if (r >= 0 && c >= 0  && r<arr.length && c<arr[0].length && arr[r][c]) {
			return false;
		}
		return true;
	}
}
