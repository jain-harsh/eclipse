package assignments2;

import java.util.Scanner;

public class Subset_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		int lim = (int) Math.pow(2, n) - 1;
//		subset(arr, target, 0, lim, " ", 1);
		subset2(arr, target, 0, "", 0);
		System.out.println();
		System.out.println(count);
	}

	static int count;

	public static void subset(int[] arr, int target, int sum, int lim, String str, int i) {
		if (sum == target) {
			System.out.print(str + " ");
//			count++;
		}
		if (i > lim) {
			return;
		}
		int temp = i;
		int rem = 0;
		int idx = 0;
		sum = 0;
		str = "";
		while (temp != 0) {
			rem = temp % 2;
			if (rem == 1) {
				str = add(str + arr[idx] + " ");
				sum = sum + arr[idx];
			}
			temp = temp / 2;
			idx++;
		}
		subset(arr, target, sum, lim, str, i + 1);
	}

	public static void subset2(int[] arr, int target, int vidx, String ans, int sum) {
		if (vidx == arr.length) {
			if (sum == target) {
				System.out.print(ans+ " ");
				count++;
			}
			return;
		}

		subset2(arr, target, vidx + 1, ans + arr[vidx]+" ", sum + arr[vidx]);
		subset2(arr, target, vidx + 1, ans, sum);
	}

	public static String add(String str) {
		return str;
	}
}
