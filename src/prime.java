import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		System.out.println("enter value");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int flag = 0;
		int i = 2;
		while (i < n) {
			if (n % i == 0)
				flag = 1;

			i = i + 1;
		}
		if (flag == 1)
			System.out.println("not prime");
		else
			System.out.println("prime");
	}
}
