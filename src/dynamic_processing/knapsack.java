package dynamic_processing;

public class knapsack {
	public static void main(String[] args) {
		int[] w = { 1, 3, 4, 5 };
		int[] p = { 1, 4, 5, 7 };
		System.out.println(knapsack(p, w, 0, 7));
		System.out.println(knapsackTD(p, w, 0, 7, new int[p.length][8]));
		knapsackBU(p, w, 0, 7);
	}

	public static int knapsack(int[] p, int[] w, int vidx, int c) {
		if (vidx == p.length) {
			return 0;
		}

		int inc = 0;
		if (w[vidx] <= c)
			inc = knapsack(p, w, vidx + 1, c - w[vidx]) + p[vidx];
		int exc = knapsack(p, w, vidx + 1, c);

		return Math.max(inc, exc);
	}

	public static int knapsackTD(int[] p, int[] w, int vidx, int c, int[][] strg) {
		if (vidx == p.length) {
			return 0;
		}
		if (strg[vidx][c] != 0) {
			return strg[vidx][c];
		}
		int inc = 0;
		if (w[vidx] <= c)
			inc = knapsackTD(p, w, vidx + 1, c - w[vidx], strg) + p[vidx];
		int exc = knapsackTD(p, w, vidx + 1, c, strg);

		return strg[vidx][c] = Math.max(inc, exc);
	}

	public static int knapsackBU(int[] p, int[] w, int vidx, int c) {
		int[][] strg = new int[p.length][c + 1];
		for (int i = p.length - 1; i >= 0; i--) {
			for (int j = 0; j <= strg[0].length - 1; j++) {
				if (i == p.length - 1) {
					strg[i][j] = 0;
					continue;
				}
				int inc = 0;
				if (w[i] <= j)
					inc = strg[i + 1][j - w[i]] + p[i];
				int exc = strg[i + 1][j];

				strg[i][j] = Math.max(inc, exc);

			}
		}
		System.out.println(strg[0][c]);
		return strg[0][c];
	}
}