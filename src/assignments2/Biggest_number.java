package assignments2;

import java.util.Scanner;

public class Biggest_number {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		for (int x = 1; x <= t; x++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
//	circular_sum(arr,n);
//			biggest(arr, n);
			sort(arr);
			for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);	
			}
			System.out.println();
		}
	}

	public static void circular_sum(int[] arr, int n) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < i + arr.length; j++) {
				int k = j % n;
				sum = sum + arr[k];
				if (sum > max)
					max = sum;
			}
		}
		System.out.println(max);
	}

	public static void biggest(int[] arr, int n) {
		long num = 0;
		for (int i = 0; i < arr.length; i++) {
			long N1 = num;
			long N2 = arr[i];
			long count1 = count(N1);
			long count2 = count(N2);
			long ans1 = N1 * (long) Math.pow(10, count2) + N2;
			long ans2 = N2 * (long) Math.pow(10, count1) + N1;
			if (ans1 > ans2) {
				num = ans1;
			} else
				num = ans2;
		}
		System.out.println(num);
	}

	public static long count(long N1) {
		int count1 =0;
		while (N1 != 0) {
			N1 = N1 / 10;
			count1++;
		}
		return count1;
	}
	public static void sort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<=n-2;i++) {
			for(int j=0;j<=n-i-2;j++){
				if (compare(arr[j], arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static boolean compare(int ans1,int ans2) {
		String n1n2 = ans1 + "" + ans2;
		String n2n1 = ans2 + "" + ans1;
		int n1n2i = Integer.parseInt(n1n2);
		int n2n1i = Integer.parseInt(n2n1);
		if (n2n1i > n1n2i) {
			return true;
		} 
		else {
			return false;
		}
	}
}
