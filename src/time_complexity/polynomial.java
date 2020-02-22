package time_complexity;

import java.util.Scanner;

public class polynomial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int n=scn.nextInt();
		polynomial(x,n);
	}
	public static void polynomial(int x,int n) {
		int multiplier=x;
		int ans=0;
			for(int j=n;j>=1;j--) {
			 ans=ans+ j*multiplier;
			multiplier=multiplier*x;
						
			}
		System.out.println(ans);
		
	}
}
