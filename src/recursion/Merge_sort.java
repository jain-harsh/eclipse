package recursion;

import java.util.Scanner;

public class Merge_sort {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 05, 40, 32 };
		int[] ans = Mergesort(arr, 0, arr.length - 1);
		for (int val : ans) {
			System.out.println(val);
		}
	}

	public static int[] merge(int[] fh, int[] sh) {
		int[] result = new int[fh.length + sh.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < fh.length && j < sh.length) {
			if (fh[i] < sh[j]) {
				result[k] = fh[i];
				i++;
				k++;
			} else {
				result[k] = sh[j];
				j++;
				k++;
			}
		}
		if (i == fh.length) {
			while (j < sh.length) {
				result[k] = sh[j];
				k++;
				j++;
			}
		}
		if (j == sh.length) {
			while (i < fh.length) {
				result[k] = fh[i];
				k++;
				i++;
			}
		}
		return result;
	}

	public static int[] Mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] end = new int[1];
			end[0] = arr[lo];
			return end;
		}
		int mid = (lo + hi) / 2;
		int fh[] = Mergesort(arr, lo, mid);
		int sh[] = Mergesort(arr, mid + 1, hi);
		int[] ans = merge(fh, sh);
		return ans;
	}
}
