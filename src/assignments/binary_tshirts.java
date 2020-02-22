package assignments;

import java.util.Scanner;

public class binary_tshirts {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int t=scn.nextInt();
		
		if(t>=1&&t<=100 ) {
			for(int i=1;i<=t;i++) {
				if(i!=1)
				System.out.println();
				int n=scn.nextInt();
				if(n>=1&&n<=500) {
			for(int j=1;j<=n;j++) {
				int rem=0,sum=0,count=0,num=j;
				while(num!=0) {
				rem=num%2;
				num=num/2;
				sum=sum+rem*(int)Math.pow(10,count);
				count++;
				}
				System.out.print(sum+" ");
				
			}}	
			}
		}
	}

}
