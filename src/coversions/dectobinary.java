package coversions;

import java.util.Scanner;

public class dectobinary {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int rem=0,multiplier=1,ans=0;
		while(n!=0) {
			rem=n%2;
			ans=ans+rem*multiplier;
			multiplier=multiplier*10;
			n=n/2;
		}
		System.out.println(ans);
	}

}
