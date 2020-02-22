package array;

import java.util.Scanner;

public class Inverse {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		int[] arr2 = new int[n];
		inverse(arr1, arr2);

	}

	public static void inverse(int[] arr1, int[] arr2) {
		int i = 0;
		for (i = 0; i < arr1.length; i++) {
			arr2[arr1[i]] = i;
		}
		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j]+ " ");
		}
	}
}