package recursion;

import java.util.Scanner;

public class array_recursion {
	static int pos=0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int item = scn.nextInt();
		int idx = 1;
//	int large=arr[0];
//	int ans=max(arr,idx,large);
//	System.out.println(ans);
//	int f=first_occ(arr,idx,item);
//		int f = last_occ(arr, idx, item);
//		int f=all_index(arr,idx,item);
//		System.out.println(f);

	}

	public static int max(int[] arr, int idx, int large) {
		if (idx == arr.length)
			return large;

		if (arr[idx] > large)
			large = arr[idx];
		int l = max(arr, idx + 1, large);
		return l;

	}

	public static int first_occ(int[] arr, int idx, int item) {
		if (idx == arr.length)
			return -1;
		if (arr[idx] == item)
			return idx;
		int f = first_occ(arr, idx + 1, item);
		return f;

	}

	public static int last_occ(int[] arr, int idx, int item) {
		
		if(idx == arr.length) {
			return pos;
		
		}
		
		if (arr[idx] == item ) {
			pos = idx;
		}
		int f = last_occ(arr, idx + 1, item);
		return f;
	}
	
	
	
}





