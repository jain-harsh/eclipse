package assignments2;

import java.util.Arrays;
import java.util.Scanner;

public class agressive_cows {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int c = scn.nextInt();
	int[] stall = new int[n];
	for (int x = 0; x < stall.length; x++) {
		stall[x] = scn.nextInt();
	}
	Arrays.sort(stall);
	int ans=0;
	int low=0;
	int high=stall[stall.length - 1] - stall[0];
	while(low<=high) {
		int mid=(low+high)/2;
		if(isItPossible(c, n, stall, mid)) {
			ans=mid;
			low=mid+1;
		}
		else {
			high=mid-1;
		}	
	}
	System.out.println(ans);
}
private static boolean isItPossible(int noc, int nos, int[] arr, int mid) {

	int cowsPlaced = 1;
	int pos = arr[0];

	for (int i = 1; i < arr.length; i++) {

		if (arr[i] - pos >= mid) {
			cowsPlaced++;
			pos = arr[i];

			if (cowsPlaced == noc)
				return true;
		}
	}

	return false;
}
}
