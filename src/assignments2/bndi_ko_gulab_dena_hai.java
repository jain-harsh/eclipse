package assignments2;

import java.util.Scanner;

public class bndi_ko_gulab_dena_hai {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int t=scn.nextInt();
		for(int x=1;x<=t;x++) {
			if(x>1)
				System.out.println();
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int item=scn.nextInt();
		sort(arr,n);
		roses(arr,item);
		
}}
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
	public static void roses(int[] arr,int item) {
		int sum=0,n=arr.length-1,place1=0,place2=1,diff2=0,pair1=0,pair2=0;	
		while(place1<=n && place2<=n )
		{			
			sum=arr[place1]+arr[place2];
			if(sum==item) {
//				int diff=arr[place2]-arr[place1];
//				if(diff<=diff2 || diff2==0) {
				 pair1=arr[place1];
				 pair2=arr[place2];
//				diff2=diff;
//				}
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
		System.out.println("Deepak should buy roses whose prices are "+pair1+" and "+pair2+".");
	}
}
