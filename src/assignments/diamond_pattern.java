package assignments;

import java.util.Scanner;

public class diamond_pattern {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1,nst=5,nsp=1;
		while(row<=n) {
			int cst=1;
			if(row==1||row==n) {
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}}
			else {
				while(cst<=nst) {
					System.out.print("*");
					cst++;
				}
				int csp=1;
				while(csp<=nsp)	{
					System.out.print(" ");
					csp=csp+1;
				}		
			}
			if(row<n/2+1) {
			nsp=nsp+2;
			nst=nst-2;
			}
			else {
				nsp=nsp-2;
				nst=nst+2;
			}
			row=row+1;
			System.out.println();
		}
	}

}
