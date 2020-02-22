package assignments;

import java.util.Scanner;

public class rhombus_pattern {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int row=1,nst=1,nsp=n-3;

	if(n%2!=0 && n<=10) {
	while(row<=n) {
		int csp=1;
		while(csp<=nsp) {
			System.out.print("  ");
			csp++;
		}
		int cst=1;
		while(cst<=nst) {
			System.out.print("* " );
			cst++;
		}
			
		if(row<n/2+1) {
			nst=nst+2;
			nsp=nsp-1;
		}
		else {
			nst=nst-2;
			nsp=nsp+1;
		}
		row=row+1;
		System.out.println();
		}
	}

}
	}


