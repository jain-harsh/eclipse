import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		int rem = 0;
		while (divident % divisor != 0) {
			rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);

	}

}
