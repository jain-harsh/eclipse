package array;

import java.util.Scanner;

public class rain_tapping {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int t= scn.nextInt();
		for(int x=1;x<=t;x++) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		tapping(arr,n);
		}
	}
	public static void tapping(int[]arr,int n) {
		int[]l=new int[n];
		int[]r=new int[n];
		l[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			l[i] = Math.max(l[i - 1], arr[i]);
		}
		r[arr.length-1]=arr[arr.length-1];
		for(int i=n-2;i>=0;i--) {
			r[i] = Math.max(l[i + 1], arr[i]);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=Math.min(l[i], r[i]) - arr[i];
		}
		System.out.println(sum);
		
	}
}




