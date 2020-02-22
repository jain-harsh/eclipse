package array;

import java.util.Scanner;

public class Rotate {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
//		int[]arr2=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int rotate = scn.nextInt();
		rotate(arr, n, rotate);
	}

	public static void rotate(int arr[], int n, int rotate) {
		rotate=rotate%n;
		if(rotate<0) {
			rotate=rotate+arr.length;
		}
		for (int i = 1; i <= rotate; i++) {
			int temp = arr[n - 1];
			for (int j = arr.length-2; j>=0; j--) {
				arr[j+1] = arr[j];
			}
			arr[0] = temp;
		}
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}

	}
}
