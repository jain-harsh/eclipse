package assignments;

import java.util.Scanner;

public class pattern_mountain {	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nsp = 2 * n - 3, nst = 1;
		while (row <= n) {
			int cst = 1,val=1;		
				while (cst <= nst) {
					System.out.print(val);
					cst = cst + 1;
					val++;
				}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}
			cst = 1;
			if(row==n) {
				cst=2;
				val--;
			}
			val--;
			while (cst <= nst) {
				System.out.print(val);
				cst = cst + 1;
				val--;
			}
			row = row + 1;
			nst = nst + 1;
			nsp = nsp - 2;
			System.out.println();
		}

	}
}


