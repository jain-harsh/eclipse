package functions;

import java.util.Scanner;

public class armstrong_func {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lo=scn.nextInt();
		int hi=scn.nextInt();
		
		printarmstrong(lo,hi);
}
	public static boolean isarmstrong(int n) {
		int count=countno(n);
		
		int num=n;
		
			int rem=0,sum=0;
			while(n!=0) {
			rem=n%10;
			sum=sum+(int)Math.pow(rem, count);
			n=n/10;	
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		
	}}
		
	
	public static void printarmstrong(int lo,int hi) {
		for(int n=lo;n<=hi;n++) {
			boolean res=isarmstrong(n);
			if(res) {
			System.out.println(n);
		}
	}
	}
		public static int countno(int n) {
			int count=0;
			while(n!=0) {
				n=n/10;
				count++;
			}
			return count;
		}
}