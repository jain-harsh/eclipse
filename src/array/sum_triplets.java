package array;

import java.util.Scanner;

public class sum_triplets {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {		
		int n=scn.nextInt();
		if(n<=1000) {
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int item=scn.nextInt();
//		sort(arr,n);
		triplets_sum(arr,item);
		}
}
//	public static void sort(int[]arr,int n){
//		for (int i = 0; i <= arr.length - 2; i++) {
//			for (int j = 0; j <= n - i - 2; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}	
//	}
//	
	public static void triplets_sum(int[] arr,int item) {
	int sum=0,n=arr.length-1,place1=0,place2=1,place3=2;
	
		while(place1<=n && place2<=n && place3<=n)
		{			
			sum=arr[place1]+arr[place2]+arr[place3];
			if(sum==item) {
				System.out.println(arr[place1]+" "+ arr[place2]+" "+arr[place3]);
				sum=0;
			}
			if(place3!=n) {
				place3++;
			}
			else if(place2!=n-1) {
				place2++;
				place3=place2+1;
			}
			else {
				place1++;
				place2=place1+1;
				place3=place2+1;
			}
		}	
	}
	}
