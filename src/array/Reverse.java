package array;

import java.util.Scanner;

public class Reverse {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		reverse(arr,n);

}
	public static void reverse(int[]arr,int n) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-1];
			arr[n-1]=temp;
			n--;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}
}