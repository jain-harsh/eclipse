package dynamic_processing;

import java.util.Scanner;

public class board_path {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//		int m = scn.nextInt();
//		int c = boardpath(0, n, "", m);
//		System.out.println(boardpathTD(0,n,new int[n+1]));
//		System.out.println(boardpathBU(0,n));
		System.out.println(boardpathBUE(0, n));
		System.out.println();
//		System.out.print(c);
	}

	private static int boardpathBUE(int curr, int end) {
		int[] arr = new int[6];
		arr[0] = 1;

		for (int x = 1; x <= end; x++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			arr[5] = arr[4];
			arr[4] = arr[3];
			arr[3] = arr[2];
			arr[2] = arr[1];
			arr[1] = arr[0];
			arr[0] = sum;
		}
		return arr[0];

	}

	private static int boardpathBU(int curr, int end) {

		int[] arr = new int[end + 6];
		arr[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			for (int j = i + 1; j <= 6 + i; j++) {
				arr[i] += arr[j];
			}
		}

		return arr[0];

	}

	private static int boardpathTD(int curr, int end, int[] arr) {
		if (curr == end) {
//			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (arr[curr] != 0) {
			return arr[curr];
		}
		int c = 0;
		for (int dice = 1; dice <= 6; dice++) {
			c += boardpathTD(curr + dice, end, arr);
		}
		arr[curr] = c;
		return c;

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
