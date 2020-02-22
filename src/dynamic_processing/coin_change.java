package dynamic_processing;

import java.util.Scanner;

public class coin_change {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int target = scn.nextInt();
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(coinchange(arr, 0, target, 0,new int[target+1]));
	}

	private static int coinchange(int[] arr, int sum, int target, int lastidx,int[]strg) {
		if (sum == target) {
			return 1;
		}
		if (sum > target) {
			return 0;
		}
		if(strg[sum]!=0) {
			return strg[sum];
		}
		int c = 0;
		for (int i = lastidx; i < arr.length; i++) {
			c += coinchange(arr, sum + arr[i], target, i,strg);
		}
		if(c==0)
		strg[sum]=c;
		return c;
	}
}
