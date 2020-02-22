package assignments;

import java.util.Scanner;

public class pattern_triangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1,nst=1,val=1,nsp=n-1;
		while(row<=n) {
		
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
			System.out.print(val+" ");
				if(cst<row) {
				val=val+1;
				
				}
			else {
				val=val-1;
				
			}
				cst++;
				}		
			row=row+1;
			val=row;
			nst=nst+2;
			nsp=nsp-1;
			System.out.println();
			
		}
	}

}
