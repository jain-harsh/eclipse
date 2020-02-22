package array;

import java.util.Scanner;

public class Bubble_sort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		bubble(arr, n);
	}

	public static void bubble(int[] arr, int n) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= n - i - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
