package assignments2;

import java.util.Scanner;

public class rat_cheese {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		char[][] arr=new char[n][m];
//		char[][] arr = { { 'O', 'X', 'O', 'O' }, { 'O', 'O', 'O', 'X' }, { 'X', 'O', 'X', 'O' }, { 'X', 'O', 'O', 'O' },
//				{ 'X', 'X', 'O', 'O' } };
//		 arr[][]= { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		for (int i = 0; i < arr.length; i++) {
			String str=scn.next();
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		cheese_path(arr, new boolean[n][m], 0, 0, n, m);
		if(count==0) {
			System.out.println("NO PATH FOUND");
		}
	}
	static int count;
	public static void cheese_path(char[][] arr, boolean[][] arr2, int r, int c, int endr, int endc) {
		if (r == endr-1  && c == endc-1 && arr[r][c]!='X') {
			arr2[r][c]=true;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr2[i][j] == true) {
						System.out.print("1 ");
					} 
					else if (arr2[i][j] == false)
						System.out.print("0 ");
				}
				System.out.println();
			}
			count++;
			System.out.println();
			return;
		}
		

		if (r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr2[r][c] || arr[r][c] == 'X') {
			return;
		}
		arr2[r][c] = true;
		cheese_path(arr, arr2, r, c + 1, endr, endc);// right
		cheese_path(arr, arr2, r + 1, c, endr, endc);// bottom
		cheese_path(arr, arr2, r, c - 1, endr, endc);// left
		cheese_path(arr, arr2, r - 1, c, endr, endc);// top
		arr2[r][c] = false;
	}
}
