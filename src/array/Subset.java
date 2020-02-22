package array;

import java.util.Scanner;

public class Subset {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		subset(arr, n);
	}

	public static void subset(int[] arr, int n) {
		int lim = (int) Math.pow(2, n) - 1;

		for (int i = 0; i <= lim; i++) {
			int temp = i;
			int rem = 0;
			int idx = 0;
			int sum = 0;
			while (temp != 0) {
				rem = temp % 2;
				if (rem == 1) {
					System.out.print(arr[idx] + " ");
					sum = sum + arr[idx];
				}
				temp = temp / 2;
				idx++;
			}
			System.out.print("sum=" + sum);
			System.out.println();
		}
	}
}
