package array;

import java.util.Scanner;

public class Subarrays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		subarray(arr, n);
	}

	public static void subarray(int[] arr, int n) {
		int j = 0, i = 0, count = 0, k = 0;
		while (i < n) {
			j = i;
			while (j < n) {
				k = i;
				while (k <= j) {
					System.out.print(arr[k] + " ");
					k++;
				}
				System.out.println();
				j++;
				k = 0;
			}
			i++;
		}
	}
}
