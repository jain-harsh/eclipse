package assignments;

import java.util.Scanner;

public class double_side_arrow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1,nsp1=n-1,nst=1,val=1,nsp2=-1;
		if(n%2 != 0) {
		while(row<=n) {
			int csp=1;
			while(csp<=nsp1) {
				System.out.print("  ");
				csp++;
			}
			
			int cst=1;
			while(cst<=nst) {
				System.out.print(val+" ");
				val--;
				cst++;
			}
			 csp=1;
			while(csp<=nsp2) {
				System.out.print("  ");
				csp++;
			}
			val++;
			
			
			cst=1;
			if(row==1 || row==n) {
				cst=2;
				val++;
			}
			while(cst<=nst) {
				System.out.print(val+" ");
				val++;
				cst++;
				
			}
			if(row<=n/2) {
				nsp1=nsp1-2;
				nst=nst+1;
				nsp2=nsp2+2;
			}
			else {
				val=val-2;
				nsp1=nsp1+2;
				nst=nst-1;
				nsp2=nsp2-2;
			}
			row=row+1;
			System.out.println();
		
			}
		
		
}
	}
}
