package functions;

import java.util.Scanner;

public class prime_function {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lo=scn.nextInt();
		int hi=scn.nextInt();
		 printprimes(lo,hi);

}
	public static void printprimes(int lo,int hi) {
		for(int i=lo;i<=hi;i++) {
			boolean res=isprime(i);
			if(res) {
				System.out.println(i);
			}
		}
	}
	public static boolean isprime(int n) {
		int flag=0;
		if(n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
			}}
		
			if(flag==1) {
				return false;
			}
			else {
				return true;
			}
			
	}
}