
package array;

import java.util.Scanner;

public class binary_search {
	static Scanner scn=new Scanner(System.in);
public static void main(String[] args) {		
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int item=scn.nextInt();
		int num=binary(arr,item);
		System.out.println(num);
}
public static int binary(int[] arr,int item) {
	int lo=0;
	int hi=arr.length-1;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(item>arr[mid])
			lo=mid+1;
		else if(item<arr[mid])
			hi=mid-1;
		else
			return mid;
		}
	return -1;
}
}