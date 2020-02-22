package assignments;

import java.util.Scanner;

public class pattern_rhomus_number {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1,nst=1,nsp=n+2,val=1;
		
			while(row<=2*n-1) {
		int csp=1;
		while(csp<=nsp) {
			System.out.print("  ");
			csp++;
		}
		int cst=1;
		while(cst<=nst) {
			System.out.print(val+" ");
			if(cst<nst/2+1) {
				val++;
			}
			else {
				val--;
			}
			cst++;
		}
		if(row<n) {
			nsp=nsp-1;
			nst=nst+2;
			val=row+1;
		}
		else {
			nsp=nsp+1;
			nst=nst-2;

		}
		row=row+1;
		System.out.println();		
			
			
		}
}

}
