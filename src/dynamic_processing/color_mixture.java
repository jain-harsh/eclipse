package dynamic_processing;

import java.util.Arrays;

public class color_mixture {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		System.out.println(mixture(arr, 0, arr.length - 1));
		int[][] strg = new int[arr.length][arr.length];
		for (int i = 0; i < strg.length; i++) {
			Arrays.fill(strg[i], -1);
		}
		System.out.println(mixtureTD(arr, 0, arr.length - 1, strg));
		System.out.println(mixtureBD(arr, 0, arr.length - 1));
	}

	public static int mixture(int[] arr, int si, int ei) {
		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {

			int lp = mixture(arr, si, k);
			int rp = mixture(arr, k + 1, ei);

			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int total = lp + rp + sw;

			if (total < min) {
				min = total;
			}
		}
		return min;
	}

	public static int color(int[] arr, int si, int ei) {
		int sum = 0;
		for (int i = si; i <= ei; i++) {
			sum += arr[i];
		}
		return sum % 100;
	}

	public static int mixtureTD(int[] arr, int si, int ei, int[][] strg) {
		if (si == ei) {
			return 0;
		}
		if (strg[si][ei] != -1) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {

			int lp = mixtureTD(arr, si, k, strg);
			int rp = mixtureTD(arr, k + 1, ei, strg);

			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int total = lp + rp + sw;

			if (total < min) {
				min = total;
			}

		}
		strg[si][ei] = min;
		return min;
	}

	public static int mixtureBD(int[] arr, int si, int ei) {
		int[][] strg = new int[arr.length][arr.length];
		int n = arr.length;
		for (int slide = 1; slide <= arr.length - 1; slide++) {
			for (si = 0; si <= n - slide - 1; si++) {
				ei = si + slide;
				int min = Integer.MAX_VALUE;
				for (int k = si; k < ei; k++) {

					int lp = strg[si][k];
					int rp = strg[k + 1][ei];

					int sw = color(arr, si, k) * color(arr, k + 1, ei);

					int total = lp + rp + sw;

					if (total < min) {
						min = total;
					}

				}
				strg[si][ei] = min;
			}
		}
		return strg[0][n - 1];
	}
}
