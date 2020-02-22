package array;

import java.util.Scanner;

public class max_path_of2array {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t = scn.nextInt();
	for(int z=1;z<=t;z++) {
	int n = scn.nextInt();
	int m = scn.nextInt();	
	int[] arr1 = new int[n];
	int[] arr2 = new int[m];
	for (int i = 0; i < n; i++) {
		arr1[i] = scn.nextInt();
	}
	for (int i = 0; i < m; i++) {
		arr2[i] = scn.nextInt();
	}
	
	int sum1=0,sum2=0,sum=0;
	int i=n-1,j=m-1;
	while(i>=0 && j>=0) {
		
			if(arr1[i]==arr2[j]) {
				sum1+=arr1[i];
				sum2+=arr2[j];
				if(sum1>sum2) {
					sum=sum+sum1;
				}
				else {
					sum=sum+sum2;	
				}
				sum1=0;
				sum2=0;
				j--;
				i--;
			}
			else if(arr1[i]>arr2[j]) {
				sum1=sum1+arr1[i];
				i--;
				
			}
			else if(arr1[i]<arr2[j]) {
				sum2=sum2+arr2[j];
				j--;
			}	
	}
	if(i>=0) {
		while(i>=0) {
			sum1=sum1+arr1[i];
			i--;
		}
	}
	if(j>=0) {
		while(j>=0) {
			sum2=sum2+arr2[j];
			j--;
		}
	}
	if(sum1!=0 ||sum2!=0) {
		if(sum1>sum2) {
			sum+=sum1;
		}
		else {
			sum+=sum2;
		}
	}
	
	System.out.println(sum);
}
}
}