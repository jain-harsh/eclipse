package assignments2;

import java.util.Scanner;

public class Soduko {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		soduko(arr, 0, 0, n);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean soduko(int[][] arr, int r, int c, int n) {

		if (c >= arr.length) {
			r=r+1;
			c = 0;
		}

		if (r >= arr.length) {
			return true;
		}
		if(arr[r][c]!=0) {
			return soduko(arr, r, c + 1, n);
		}
		else {
		for (int i = 1; i <= n; i++) {
			int num = i;
				if (is_safe(arr, r, c, num)) {
					arr[r][c] = num;
					if (soduko(arr, r, c + 1, n))
						return true;
					arr[r][c] = 0;
				

			}
		}
		}
		return false;
	}

	public static boolean is_safe(int[][] arr, int row, int col, int num) {

		int a = row - (row % 3);
		int b = col - (col % 3);

		for (int i = a; i <= a + 2; i++) {
			for (int j = b; j <= b + 2; j++) {
				if (arr[i][j] == num) {
					return false;
				}
			}
		}

		int r = arr.length - 1;
		int c = col;

		while (r >= 0) {
			if (arr[r][c] == num) {
				return false;
			}
			r--;
		}
		r = row;
		c = arr[0].length - 1;
		while (c >= 0) {
			if (arr[r][c] == num) {
				return false;
			}
			c--;
		}
		return true;
	}
}
