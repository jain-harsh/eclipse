package assignments;

import java.util.Scanner;

public class inverted_hour_glass {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n=scn.nextInt();
	int row=1,nsp=2*n-1,nst=1,val=n;
	
	while(row<=2*n+1){
		int cst=1;
		while(cst<=nst) {
			System.out.print(val+" ");
			cst++;
			val--;
		}
		int csp=1;
		
		while(csp<=nsp) {
			System.out.print("  ");
			csp++;
		}
		cst=1;
		if(row==n+1) {
			val=val+1;
			cst=2;
		}
		while(cst<=nst) {
			val++;
			System.out.print(val+" ");
			cst++;

		}
		
		if(row<=n) {
			nst=nst+1;
			nsp=nsp-2;
		}
		
		else {
			nst=nst-1;
			nsp=nsp+2;
		}
		row=row+1;
		System.out.println();
	}
}
}
