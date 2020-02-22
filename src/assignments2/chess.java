package assignments2;

import java.util.Scanner;

public class chess {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		chess(new int[n][n], 0, 0, "");
		System.out.println();
		System.out.println(count);
	}

	static int count;

	public static void chess(int[][] board, int r, int c, String ans) {
		if (r == board.length - 1 && c == board[0].length - 1) {
			System.out.print(ans + "{" + r + "-" + c + "}" + " ");
			count++;
			return;
		}

		if (c >= board[0].length || r >= board[0].length) {
			return;
		}

//		board[r][c] = true;

		chess(board, r + 2, c + 1, ans + "{" + r + "-" + c + "}" + "K");// knight

		chess(board, r + 1, c + 2, ans + "{" + r + "-" + c + "}" + "K");// knight

		int i = 1;
		if (r == 0 || r == board.length - 1 || c == 0 || c == board[0].length - 1) {
			while (c + i < board[0].length) {

				int a = c + i;
				chess(board, r, a, ans + "{" + r + "-" + c + "}" + "R");// rook horizontal
				i++;
			}
		}
		int j = 1;
		if (c == 0 || c == board[0].length - 1 || r == 0 || r == board.length - 1) {
			while (r + j < board.length) {

				int b = r + j;
				chess(board, b, c, ans + "{" + r + "-" + c + "}" + "R");// rook vertical
				j++;
			}
		}

		int k = 1;
		if (c == r || c + r == board.length - 1)
			while (r + k < board.length && c + k < board[0].length) {
				{
					int a = r + k;
					int b = c + k;
					chess(board, a, b, ans + "{" + r + "-" + c + "}" + "B");// bishop diagnol
					k++;
				}
			}

//		board[r][c] = false;
	}
}