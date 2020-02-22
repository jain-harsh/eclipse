package assignments2;

import java.util.Scanner;

public class book_allocation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			binary(arr, m);
		}
	}

	public static void binary(int[] arr, int m) {
		int lo = 0;
		int hi = 0;
		for (int val : arr) {
			hi += val;
		}
		int finalans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (allocate(arr, m, mid)) {
				finalans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(finalans);
	}

	public static boolean allocate(int[] arr, int m, int mid) {
		int sum = 0;
		int student = 1;
		for (int i = 0; i < arr.length;) {
			if (sum + arr[i] <= mid) {
				sum = sum + arr[i];
				i++;
			} else {
				student++;
				sum = 0;
			}
			if (student > m) {
				return false;
			}

		}
		return true;

	}
}
