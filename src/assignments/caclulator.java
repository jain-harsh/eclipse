package assignments;

import java.util.Scanner;

public class caclulator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean bl = true;
		while (bl) {
			char n = scn.next().charAt(0);
			int n1;
			int n2;

			if (n == '*' || n == '+' || n == '-' || n == '/' || n == '%') {
				n1 = scn.nextInt();
				n2 = scn.nextInt();
//			 if(n1>0 && n2>0) {
				if (n == '+')
					System.out.println(n1 + n2);
				else if (n == '-')
					System.out.println(n1 - n2);
				else if (n == '*')
					System.out.println(n1 * n2);
				else if (n == '/' && n2 != 0)
					System.out.println(n1 / n2);
				else if (n == '%' && n2 != 0)
					System.out.println(n1 % n2);
			} else if (n == 'x' || n == 'X')
				bl = false;
			else
				System.out.println("Invalid operation.try again");
		}
//			}

	}
}
