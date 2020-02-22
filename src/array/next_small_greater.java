package array;

import java.util.Scanner;

public class next_small_greater {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			insert(arr);
			small_great(arr);
		}
	}

	public static void insert(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
	}

	public static void small_great(int[] arr) {
		int max = arr[0], i = 0;
		for(i=0;i<arr.length;i++) {
			max=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>max) {
					for(int x=j+1;x<arr.length;x++) {
						if(arr[x]<arr[j]) {
							System.out.print(arr[x]+" ");
							break;
						}
						else if(x==arr.length-1)
							System.out.print("-1 ");
					}
					if(j==arr.length-1)
						System.out.print("-1 ");
					break;
				}
				else if(j==arr.length-1)
					System.out.print("-1 ");
			}
			if(i==arr.length-1)
				System.out.println("-1 ");
		}
		
	}
}
