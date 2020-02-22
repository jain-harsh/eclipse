package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class intersection {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();

//		int[] arr1 = new int[n];
//		int[] arr2 = new int[n];
		int[] arr1 = { 10, 30, 40, 40, 45, 50, 50, 50, 60, 90 };
		int[] arr2 = { 20, 35, 40, 40, 40, 47, 50, 60, 60, 60 };

//	for(int i=0;i<arr1.length-1;i++) {
//		arr1[i]=scn.nextInt();
//	}
//	for(int i=0;i<arr2.length-1;i++) {
//		arr2[i]=scn.nextInt();
//	}
		intersection(arr1, arr2);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> ans = new ArrayList<>();
		int count = 0, i = 0;
		while (count < arr1.length && i < arr2.length) {
			if (arr1[count] == arr2[i]) {
				ans.add(arr1[count]);
				count++;
				i++;
			} else if (arr1[count] < arr2[i]) {
				count++;
			} else if (arr1[count] > arr2[i]) {
				i++;
			}

		}
		System.out.println(ans);

	}
}
