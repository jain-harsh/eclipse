package array;
//seive of eradtosthenes

import java.util.Arrays;
import java.util.Scanner;

public class SOE {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		soe(n);
	}

	public static void soe(int n) {
		boolean[] arr = new boolean[n + 1];
//		Arrays.fill(arr, false);
		arr[0] = arr[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (arr[i]) {
				continue;
			}
			for (int j = 2; i * j <= n; j++) {
				arr[i * j] = true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) {
				System.out.println(i);
			}
		}
	}
}
