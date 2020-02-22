package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
//	int n1 = scn.nextInt();
//	int n2 = scn.nextInt();
//	int[] arr1 = new int[n1];
//	int[] arr2 = new int[n2];
		int[] arr1 = { 9, 9, 9, 9 };
		int[] arr2 = { 9, 9, 9, 9 };
		sum(arr1, arr2);

	}

	public static void sum(int[] arr1, int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<>();
		int i = arr1.length - 1, j = arr2.length - 1;
		int carry = 0, sum = 0;
		while (i >= 0 || j >= 0) {
//			int sum=0;
			if (i >= 0)
				sum = sum + arr1[i];
			if (j >= 0)
				sum = sum + arr2[j];
			int rem = sum % 10;
			ans.add(0, rem);
			sum = sum / 10;
			i--;
			j--;
		}
		if (sum > 0)
			ans.add(0, sum);
		System.out.println(ans);
	}
}
