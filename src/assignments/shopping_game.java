package assignments;

import java.util.Scanner;

public class shopping_game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		int i = 1;
		if (T >= 1 && T <= 100) {
			while (i <= T) {
				int count_a = -1, count_h = 0, sum_a = 0, sum_h = 0;
				int M = scn.nextInt();
				int N = scn.nextInt();
				if (M > 0 && N > 0) {
					boolean bl = true;
					while (bl) {
						
							count_a += 2;
							sum_a = sum_a + count_a;
							if (sum_a >= M) { 
							break;
						}
						
							count_h += 2;
							sum_h = sum_h + count_h;
							if (sum_h >= N) {
							break;
						}

					}
				
				if (sum_a >= M) {
					System.out.println("Harshit");
				} else if (sum_h >= N) {
					System.out.println("Aayush");
				}
				i++;
			}}
		}
	}

}
