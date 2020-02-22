package array;

import java.util.Scanner;

public class linear_search {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n=scn.nextInt();
		
		int[]arr= new int[n];
		System.out.println("enter array");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("enter element to be searched");
		int search=scn.nextInt();
		int lsearch=lsearch(arr,n,search);
			System.out.println("element found at");
			System.out.println(lsearch);
		
	}
	public static int lsearch(int arr[],int n,int search) {
	
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				return i;
			}
			
		}
		return -1;
	}
		
	
}
