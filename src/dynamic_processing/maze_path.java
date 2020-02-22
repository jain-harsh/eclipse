package dynamic_processing;

import java.util.Arrays;
import java.util.Scanner;

public class maze_path {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
//	maze(0,0,n,m);
		System.out.println(mazeTD(0, 0, n, m, new int[n + 1][m + 1]));
		System.out.println(mazeBD(n, m));
		System.out.println(mazeBUSE(n, m));
	}

	private static int mazeBUSE(int er, int ec) {
		int[] arr = new int[ec + 1];

		Arrays.fill(arr, 1);
		for (int i = 0; i < er; i++) {
			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j] = arr[j] + arr[j + 1];
			}

		}
		return arr[0];
	}

	private static int mazeBD(int endr, int endc) {
		int[][] arr = new int[endr + 2][endc + 2];
		arr[endr][endc] = 1;
		for (int i = endr; i >=0; i--) {
			for (int j = endc; j >=0; j--) {
				if (i == endr && j == endc) {
					continue;
				}
				arr[i][j] = arr[i + 1][j] + arr[i][j + 1];
			}
		}
		return arr[0][0];

	}

	private static int mazeTD(int r, int c, int endr, int endc, int[][] ans) {

		if (r == endr && c == endc) {
			return 1;
		}

		if (r > endr || c > endc) {
			return 0;
		}
		if (ans[r][c] != 0) {
			return ans[r][c];
		}
		int ch = 0;
		int cv = 0;
		ch += mazeTD(r, c + 1, endr, endc, ans);
		cv += mazeTD(r + 1, c, endr, endc, ans);
		ans[r][c] = ch + cv;
		return ch + cv;

	}

	public static int maze(int r, int c, int endr, int endc) {

		if (r == endr - 1 && c == endc - 1) {
			return 1;
		}

		if (r > endr || c > endc) {
			return 0;
		}
		int count = 0;
		count += maze(r, c + 1, endr, endc);
		count += maze(r + 1, c, endr, endc);
		return count;
	}

}
