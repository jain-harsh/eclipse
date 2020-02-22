package assignments;

import java.util.Scanner;

public class delhi_odd_even {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i=1,n1;
		while(i<=n) {
			int rem=0,sum1=0,sum2=0;
		 n1=scn.nextInt();
		while(n1!=0) {
		rem=n1%10;
		n1=n1/10;
			if(rem%2==0) {
				sum1=sum1+rem;
			}
			else {
				sum2=sum2+rem;
			}}
		if(sum1%4==0 || sum2%3==0)
			System.out.println("yes");
		else
			System.out.println("no");		
			i++;
		}
		}
}

