package assignments;

import java.util.Scanner;

public class assignment4 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int sum1=0,sum2=0,count=0,rem=0;
	while(n!=0) {
		rem=n%10;
		if(count%2==0)
		{
			sum1=sum1+rem;
		}
		else {
					sum2=sum2+rem;					
		}n=n/10;
		rem=0;
		count++;
	}
    	System.out.println(sum1);
    	System.out.println(sum2);
}

}
