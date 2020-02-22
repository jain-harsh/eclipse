package recursion;

import java.util.Scanner;

public class Quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 5, 40, 32 };
		sort(arr, 0, arr.length - 1);
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void sort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int l = lo;
		int r = hi;
		while (l <= r) {
			while (arr[l] < pivot) {
				l++;
			}
			while (arr[r] > pivot) {
				r--;
			}
			if (l <= r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		sort(arr, lo, r);
		sort(arr, l, hi);
		return;
	}
}
