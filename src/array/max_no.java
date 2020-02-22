package array;

import java.util.Scanner;

public class max_no {
	static Scanner scn=new Scanner(System.in);
public static void main(String[] args) {
	
	int n=scn.nextInt();
	int[]arr= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scn.nextInt();
	}
	int max=max(arr,n);
	System.out.println(max);
}

public static int max(int arr[],int n) {
	int max=arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}}
		return max;
	}
}