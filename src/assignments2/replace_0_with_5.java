package assignments2;

import java.util.Scanner;

public class replace_0_with_5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong();
		long rem=0,num=n,count=0;
		if(n==0) {
			System.out.println("5");
		}
		else {
	while(num!=0) {
		rem=num%10;
		if(rem==0) {
			n=n+5*(long) Math.pow(10,count );
		}
		num=num/10;
		count++;	
	}
	System.out.println(n);
	
	
	}}
}
