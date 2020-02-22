package assignments2;

import java.util.Scanner;

public class k_swaps {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
		String n=scn.next();

		char[] arr = n.toCharArray();
		int k = scn.nextInt();
		swap(arr,k);
	}
	public static void swap(char[] arr,int k) {
		
		int small=arr[0];
		int large=arr[arr.length-1];
		int idx=arr.length-1;
		int idxs=0;
		int front=0;
		int end=arr.length-1;
		for(int t=0;t<k;t++) {
				large=larger(arr, idx);
				for(int i=arr.length-1;i>=0;i--) {
					if(large==arr[i]) {
						idx=i;
					}
				}
				small=smaller(arr, idxs);
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==small) {
						idxs=i;
					}
				}
				if(arr[front]<large) {
					swap(arr,idxs,idx);
				}
				idx--;
				front++;
				end--;
				
			
		}
	}
	public static void swap(char []arr,int i,int j) {
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int larger(char[]arr,int idx) {
		int large=arr[arr.length-1];
		int pos=0;
		for(int i=idx;i>=0;i--) {
			if(arr[i]>large) {
				large=arr[i];
				pos=i;
			}
		}
		return large;
	}
	public static int smaller(char[]arr,int idx) {
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
//				pos=i;
			}
		}
		return small;
	}
}
