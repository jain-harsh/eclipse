package assignments;

import java.util.Scanner;

public class patter_with_zeros {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1,nst=1,val=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				if(cst==1 || cst==nst) {
				System.out.print(val+"	");
				cst++;
				}
				else {
					System.out.print("0"+"	");
					cst++;
				}
		
			}
			row=row+1;
			System.out.println();
			nst=nst+1;
			val++;
		}
	}

}
