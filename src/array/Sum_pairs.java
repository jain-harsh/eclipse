package array;

import java.util.Scanner;

public class Sum_pairs {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {		
		int n=scn.nextInt();
		if(n<=1000) {
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int item=scn.nextInt();
		sort(arr,n);
		pair_sum(arr,item);
		}
}
	public static void sort(int[]arr,int n){
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= n - i - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}	
	}
	public static void pair_sum(int[] arr,int item) {
		int sum=0,n=arr.length-1,place1=0,place2=1;
		
		while(place1<=n && place2<=n )
		{			
			sum=arr[place1]+arr[place2];
			if(sum==item) {
				System.out.println(arr[place1]+" and "+ arr[place2]);
				sum=0;
			}
			 if(place2!=n) {
				place2++;
			}
			else {
				place1++;
				place2=place1+1;
			}
		}	
	}
		
	}
	

