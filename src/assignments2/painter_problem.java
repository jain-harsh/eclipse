package assignments2;

import java.util.Scanner;

public class painter_problem {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		binary(arr, m);
	}

	public static void binary(int[] arr, int m) {
		int lo = 0;
		int hi = 0;
		for (int val : arr) {
			hi += val;
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (allocate(arr, m, mid)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean allocate(int[] arr, int m, int mid) {
		int time = 0;
		int painters = 1;
		for (int i = 0; i < arr.length; ) {
			if (time + arr[i] <= mid) {
				time = time + arr[i];
				i++;
			} else {
				painters++;
				time = 0;
			}
			if (painters > m) {
				return false;
			}

		}
		return true;

	}
}
