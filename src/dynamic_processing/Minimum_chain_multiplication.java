package dynamic_processing;

import java.util.Scanner;

public class Minimum_chain_multiplication {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int[] arr= {1,2,3,4,5};
	System.out.println(MCM(arr,0,arr.length-1));//matrix chain multiplication
	System.out.println();
	System.out.println();
}

public static int MCM(int[]arr,int si,int ei) {
	if(ei-si==1) {
		return 0;
	}
	int min=4000;
	for(int k=si+1;k<=ei-1;k++) {
		
		int lp=MCM(arr, si, k);
		int rp=MCM(arr, k, ei);
	
		int sw=arr[si]*arr[ei]*arr[k];
		int total=lp+rp+sw;
		if(total<min) {
			min=total;
		}
	}
	return min;
}

public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {

	if (ei - si == 1) {
		return 0;
	}

	if (strg[si][ei] != 0) {
		return strg[si][ei];
	}

	int min = Integer.MAX_VALUE;

	for (int k = si + 1; k <= ei - 1; k++) {

		int fp = MCMTD(arr, si, k, strg);
		int sp = MCMTD(arr, k, ei, strg);

		int sw = arr[si] * arr[k] * arr[ei];

		int total = fp + sp + sw;

		if (total < min) {
			min = total;
		}
	}

	strg[si][ei] = min;

	return min;

}

public static int MCMBU(int[] arr) {

	int n = arr.length;
	int[][] strg = new int[n][n];

	for (int slide = 1; slide <= n - 2; slide++) {

		for (int si = 0; si <= n - slide - 2; si++) {

			int ei = si + slide + 1;

			// copy
			int min = Integer.MAX_VALUE;

			for (int k = si + 1; k <= ei - 1; k++) {

				int fp = strg[si][k];
				int sp = strg[k][ei];

				int sw = arr[si] * arr[k] * arr[ei];

				int total = fp + sp + sw;

				if (total < min) {
					min = total;
				}
			}

			strg[si][ei] = min;
			//

		}

	}

	return strg[0][n - 1];

}
}
