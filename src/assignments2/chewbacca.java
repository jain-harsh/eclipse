package assignments2;

import java.util.Scanner;

public class chewbacca {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong();
		long rem=0,num=n,ans=0,sum=0,count=0;
		while(num!=0 ) {
			if(num==9) {
				sum=sum+9*(long)Math.pow(10,count);
				num=num/10;
			}
			else {
			rem=num%10;
			ans=rem;
			if(rem>=5) {
				ans=9-rem;
			}
			sum=sum+ans*(long)Math.pow(10,count);
			num=num/10;
			count++;
			ans=0;	
		}}
		if(sum==0) {
			sum=sum+rem*(long)Math.pow(10,count-1);
		}
	System.out.println(sum);
	}
	
}