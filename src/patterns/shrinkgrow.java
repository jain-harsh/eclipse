package patterns;

import java.util.Scanner;

public class shrinkgrow {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1,nst=1,val=1;
		while(row<=2*n-1) {
			
			int cst=1;
			while(cst<=nst) {
				if(cst%2==0)
				System.out.print(val);
				else
					System.out.print("*");
				cst=cst+1;					
			}
			if(row<n-1) {
				nst=nst+1;
			    val=val+1;
			}
			else
				{nst=nst-1;
				val=val-1;
				}
				
			row=row+1;
			System.out.println();
			
		}
			
	}

}
