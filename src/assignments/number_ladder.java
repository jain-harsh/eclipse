package assignments;

import java.util.Scanner;

public class number_ladder {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1,nst=1,val=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print(val + " " );
				cst++;
				val++;
			}
			row=row+1;
			System.out.println();
			nst=nst+1;
			
		}
	}

}
