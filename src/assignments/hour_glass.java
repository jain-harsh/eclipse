package assignments;

import java.util.Scanner;

public class hour_glass {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int row=1,nst=2*n+1,nsp=0,val=n;
	while(row<=2*n+1) {
		int csp=1;
		while(csp<=nsp) {
			System.out.print("  ");
			csp++;
		}
		int cst=1;
		while(cst<=nst) {
			System.out.print(val+" ");
			cst++;
			if(cst<=nst/2+1) {
				val--;			
			}
			else {
				val++;
			}
			
		}
		if(row<n+1) {
			nsp=nsp+1;
			nst=nst-2;
			val=val-2;
		}
		else {
			nsp=nsp-1;
			nst=nst+2;
		}
		row=row+1;
		System.out.println();
			
	}
	

}}
