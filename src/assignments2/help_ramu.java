package assignments2;

import java.util.Scanner;

public class help_ramu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 1; i <= t; i++) {

			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();
			int r = scn.nextInt();
			int c = scn.nextInt();
			int[] rick = new int[r];
			int[] cab = new int[c];
			for (int x = 0; x < rick.length; x++) {
				rick[x] = scn.nextInt();
			}
			for (int x = 0; x < cab.length; x++) {
				cab[x] = scn.nextInt();
			}
			help(rick, cab, c1, c2, c3, c4);
		}

	}

	public static void help(int[] rick, int[] cab, int c1, int c2, int c3, int c4) {
		int price1_r = 0;
		for (int i = 0; i < rick.length; i++) {
			if (rick[i] * c1 < c2) {
				price1_r += rick[i] * c1;
			} else
				price1_r += c2;
		}
		int cost_r = 0;
		if (price1_r < c3) {
			cost_r = price1_r;
		} else
			cost_r = c3;

		int price1_c = 0;
		for (int i = 0; i < cab.length; i++) {
			if (cab[i] * c1 < c2) {
				price1_c = price1_c + rick[i] * c1;
			} else
				price1_c += c2;
		}
		int cost_c = 0;
		if (price1_c < c3) {
			cost_c = price1_c;
		} else
			cost_c = c3;

		int ans = cost_c + cost_r;
		if (ans < c4) {
			System.out.println(ans);
		} else
			System.out.println(c4);
	}
	
//	public static void help(int[] rick, int[] cab, int c1, int c2, int c3, int c4) {
//		
//		int mincost_r=ans(rick, c1, c2, c3, c4);
//		int mincost_c=ans(cab, c1, c2, c3, c4);
//		
//		System.out.println(Math.min(c4, mincost_c+mincost_r));
//		
//	}
//	public static int ans(int[] transport, int c1, int c2, int c3, int c4) {
//		int sum=0;
//		for(int i=0;i<transport.length;i++) {
//		sum+=Math.min(transport[i]*c1, c2);
//		}
//		return Math.min(c3, sum);
//	}
}
