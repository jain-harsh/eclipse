package coversions;

import java.util.Scanner;

public class binary_to_decimal {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int rem=0,multiplier=1,ans=0;
	while(n!=0) {
		rem=n%10;
		ans=ans+rem*multiplier;
		multiplier=multiplier*2;
		n=n/10;
	}
	System.out.println(ans);
}}
