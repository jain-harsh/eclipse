package assignments;

import java.util.Scanner;

public class paatern_fabonicci {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int fab=0,row=1,nst=1,a=0,b=1;
	while(row<=n) {
		int cst=1;
		while(cst<=nst) {
			System.out.print(fab+"	");
			cst=cst+1;
			fab=a+b;
			b=a;
			a=fab;
		}
		System.out.println();
		row=row+1;
		nst=nst+1;
		
	}
}
}
