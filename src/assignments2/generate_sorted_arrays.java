package assignments2;

import java.util.Scanner;

public class generate_sorted_arrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr1 = new int[n];
		int m = scn.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scn.nextInt();
		}
		sort(arr1, arr2, n, m);
	}
	public static void sort(int[] arr1, int[] arr2, int n, int m) {
		int[] ans=new int[m+n];
		int p1=0;
		int p2=0;
		int p3=0;
		for(int i=0;i<arr1.length;i++) {
			p1=i;
			p3=0;p2=0;
			ans[p3]=arr1[i];
			p3++;
			int num=arr1[p1];
			p1=1;
			int j=0;
			while(j<arr2.length) {
				
				if(p2<arr2.length && arr2[p2]>num && p3%2!=0) {
					ans[p3]=arr2[p2];
					num=arr2[p2];
					display(ans, p3);
					p3++;
					p2++;
					j++;
				}else if(p3%2!=0) {
					p2++;
				}
				if( p1<arr1.length && arr1[p1]>num && p3%2==0  ) {
					ans[p3]=arr1[p1];
					num=arr1[p1];
					p1++;
					p3++;
					j++;
				}else if(p3%2==0) {
					p1++;
				}
				if(p2-1==arr2.length || p1-1==arr1.length) {
					break;
				}
			}
		}
	}
	public static void display(int[]arr,int p) {
		for(int i=0;i<=p;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

//3 4
//10 15 25
//1 5 20 30




