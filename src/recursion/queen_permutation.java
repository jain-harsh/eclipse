
package recursion;

import java.util.Scanner;

public class queen_permutation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		queen(new boolean[4],0,2,"");
//		queencombination(new boolean[4],0,2,"",-1);
//		coinchange(new int[] { 2, 3, 5, 6 }, 10, "", 0, 0);
//		queencombinationbox(new boolean[4],0,0,2,"");
		int n=scn.nextInt();
		queencombination2d(new boolean[n][n],0,0,0,n,"");
		System.out.println();
		System.out.println(c);
//		int maze[][]= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
//		blockmaze( maze,0,0,"",new boolean[maze.length][maze[0].length] );
//		char grid[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
//		boolean ans = false;
//		String target = scn.next();
//		for (int i = 0; i < grid.length; i++) {
//			for (int j = 0; j < grid[0].length; j++) {
//				ans = ans || find(grid, i, j, new boolean[grid.length][grid[0].length], target, 0);
//			}
//		}
//		System.out.println(ans);
	}

	static int count;

	public static void queen(boolean[] board, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(++count + " " + ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queen(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i);
				board[i] = false;
			}
		}
	}

	public static void queencombination(boolean[] board, int qpsf, int tq, String ans, int lastindex) {

		if (qpsf == tq) {
			System.out.println(++count + " " + ans);
			return;
		}
		for (int i = lastindex + 1; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queencombination(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i, i);
				board[i] = false;
			}
		}
	}

	public static void queencombinationbox(boolean[] board, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			return;
		}
		board[col] = true;
		queencombinationbox(board, col + 1, qpsf + 1, tq, ans + "b" + col);// yes
		board[col] = false;
		queencombinationbox(board, col + 1, qpsf, tq, ans);// no
	}

	static int c;

	public static void queencombination2d(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			c=c+1;
			System.out.print( ans+" ");
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;

		}
		if (row == board.length) {
			return;
		}
		if (safe(board, row, col)) {
			board[row][col] = true;
			int ans1=row+1;
			int ans2=col+1;
			queencombination2d(board, row, col + 1, qpsf + 1, tq, ans+"{" + ans1 + "-" + ans2 + "} ");// yes
			board[row][col] = false;
		}
		queencombination2d(board, row, col + 1, qpsf, tq, ans);// no
	}

	public static void coinchange(int[] coin, int target, String ans, int sum, int lastindx) {
		if (sum == target) {
			System.out.println(ans);
			return;
		}
		if (sum > target) {
			return;
		}

		for (int i = lastindx; i < coin.length; i++) {
			int rem = coin[i];
			coinchange(coin, target, ans + rem, sum + rem, i);
		}
	}

	public static boolean safe(boolean[][] board, int row, int col) {

		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void blockmaze(int[][] block, int row, int col, String str, boolean[][] visited) {

		if (row == block.length - 1 && col == block[0].length - 1) {
			System.out.println(str);
			return;
		}
		if (row < 0 || col < 0 || row >= block.length || col >= block[0].length || visited[row][col]
				|| block[row][col] == 1) {
			return;
		}
		visited[row][col] = true;
		blockmaze(block, row + 1, col, str + "B", visited);
		blockmaze(block, row - 1, col, str + "T", visited);
		blockmaze(block, row, col - 1, str + "L", visited);
		blockmaze(block, row, col + 1, str + "R", visited);
		visited[row][col] = false;
	}

	public static boolean find(char[][] grid, int row, int col, boolean[][] visited, String target, int idx) {
		if (idx == target.length()) {
			return true;
		}
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col]) {
			return false;
		}
		if (target.charAt(idx) != grid[row][col]) {
			return false;
		}
		visited[row][col] = true;
		if (find(grid, row + 1, col, visited, target, idx + 1))
			return true;
		if (find(grid, row, col+1, visited, target, idx + 1))
			return true;
		if (find(grid, row - 1, col, visited, target, idx + 1))
			return true;
		if (find(grid, row , col -1, visited, target, idx + 1))
			return true;
		visited[row][col] = false;
		return false;
	}
	
}
