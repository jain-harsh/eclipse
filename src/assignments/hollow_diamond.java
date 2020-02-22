package assignments;

import java.util.Scanner;

public class hollow_diamond {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1,nst=n/2+1,nsp=-1;
		if(n%2!=0) {
		while(row<=n) {
			int cst=1;
			
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			int csp=1;
			if(row==n ||row==1) {
				csp=0;
			}
				while(csp<=nsp) {
				System.out.print("  ");
				csp++;
				
			}
				cst=1;
				if(row==1||row==n) {
				cst=2;
				}
				
				while(cst<=nst) {
					System.out.print("* ");
					cst++;
				}
				
			if(row<n/2+1) {
				nst=nst-1;
				nsp=nsp+2;
			}
			else {
				nst=nst+1;
				nsp=nsp-2;
				
			}
			row=row+1;
			System.out.println();	
		}}
	
	}

}
