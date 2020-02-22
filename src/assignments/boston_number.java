package assignments;

import java.util.Scanner;

public class boston_number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int rem=0,sum=0,i=2,num=n,boston=0,count=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}	
//		System.out.println(sum);
		while(i<=num) {
			int factor=0,j=i;
			rem=0;
			if(num%i==0) {
				factor=i;
				if(i>9) {
					factor=0;
					while(j!=0) {
					rem=j%10;
					factor=factor+rem;
					j=j/10;
						}		}
				boston=boston+factor;
				num=num/i;
				count++;
			}
			else
			i++;
		}
//	System.out.println(boston);
		if(sum==boston && count>1 )
			System.out.println("1");
		else
			System.out.println("0");
	}
}