package assignments;

import java.util.Scanner;

public class von_neumann {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int i=1;
		while(i<=n) {
			int n1=scn.nextInt();
			int num=n1,count=0;
			while(num!=0) {
				num=num/10;
				count++;
			}
			System.out.println(count);
			if(count<=16) {
			int rem=0,sum=0,f=0,multi=0;
			while(n1!=0) {
				rem=n1%10;
				f=f+rem*(int) Math.pow(2,multi);
				multi++;
				n1=n1/10;	
			}	
			System.out.println(f);
			i++;
		}
			}
	
	}

}
