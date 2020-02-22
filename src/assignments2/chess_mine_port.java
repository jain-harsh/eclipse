package assignments2;

import java.util.Arrays;
import java.util.Scanner;

public class chess_mine_port {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		char[][] ans=declare(n, new char[n][n]);
//		for(int i=0;i<ans.length;i++) {
//			for(int j=0;j<ans[0].length;j++) {
//				System.out.print(ans[i][j]);
//			}
//			System.out.println();
//		}
		chess(ans, 0, 0, "");
		System.out.println();
		System.out.println(count);
	}

	static int count;

	public static void chess(char[][] board, int r, int c, String ans) {
		if (r == board.length - 1 && c == board[0].length - 1) {
			System.out.print(ans + "{" + r + "-" + c + "}" + " ");
			count++;
			return;
		}

		if (c >= board[0].length || r >= board[0].length) {
			return;
		}

//		board[r][c] = true;
		if(board[r][c]=='P')
		{
			chess(board, board.length-1, board[0].length-1, ans+ "{" + r + "-" + c + "}" + "P");
		}
		if(board[r][c]!='M')
		chess(board, r + 2, c + 1, ans + "{" + r + "-" + c + "}" + "K");// knight
		if(board[r][c]!='M')
		chess(board, r + 1, c + 2, ans + "{" + r + "-" + c + "}" + "K");// knight

		int i = 1;
		if (r == 0 || r == board.length - 1 || c == 0 || c == board[0].length - 1) {
			while (c + i < board[0].length) {
				if(board[r][c]!='M') {
				int a = c + i;
				chess(board, r, a, ans + "{" + r + "-" + c + "}" + "R");// rook horizontal
				}
				i++;
			}
		}
		int j = 1;
		if (c == 0 || c == board[0].length - 1 || r == 0 || r == board.length - 1) {
			while (r + j < board.length) {
				if(board[r][c]!='M') {
				int b = r + j;
				chess(board, b, c, ans + "{" + r + "-" + c + "}" + "R");// rook vertical
				}
				j++;
				
			}
		}

		int k = 1;
		if (c == r || c + r == board.length - 1)
			while (r + k < board.length && c + k < board[0].length) {
				{
					if(board[r][c]!='M') {
					int a = r + k;
					int b = c + k;
					chess(board, a, b, ans + "{" + r + "-" + c + "}" + "B");// bishop diagnol
					}
					k++;
				}
			}

//		board[r][c] = false;
	}
	public static char[][] declare(int n,char [][] ans) {
		boolean[] arr=new boolean[n*n+1]; 
		arr[0]=arr[1]=true;
		boolean num=true;
		for(int i=2;i*i<=arr.length;i++) {
			for(int j=2;i*j<arr.length;j++) {
			arr[i*j]=true;
			}
		}
		int count=1;
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				if(arr[count]==false) {
					if(num)
						ans[i][j]='M';
					else
						ans[i][j]='P';
				
					num=!num;
				}	
				else
					ans[i][j]='R';
				count++;
			}
		}
		return ans;
	}
}




