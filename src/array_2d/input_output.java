package array_2d;

import java.util.Scanner;

public class input_output {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int m=scn.nextInt();
		int n=scn.nextInt();
		int[][] arr=new int[m][n];
//		int arr[][] = { { 20, 30, 40 }, { 50, 60, 70 }, { 10, 20, 90 } };
//		int arr2[][] = { { 20, 30, 40 }, { 50, 60, 70 }, { 10, 20, 90 } };
//		vertical_display(arr);
		insert(arr);
//		display(arr);
//		wave_display(arr);
//		spiral_display(arr);
//		multiply(arr, arr2);
		spiral_display_clockwise(arr);

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

	public static void insert(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
//			System.out.println("col for" + i + "row");
//			int col = scn.nextInt();3
//			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println("[" + i + " " + j + "]");
				arr[i][j] = scn.nextInt();
			}
//			System.out.println();
		}
	}

	public static void vertical_display(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void wave_display(int[][] arr) {
		int i = 0, j = 0, count = 0;
		while (count < arr[0].length) {
			if (count % 2 == 0) {
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i][count]+", ");
				}
			} else {
				for (j = arr.length - 1; j >= 0; j--) {
					System.out.print(arr[j][count]+", ");
				}
			}
			count++;
			if(count==arr[0].length)
				System.out.println("END");
		}
	}

	public static void spiral_display(int[][] arr) {
		int mincol = 0, minrow = 0, maxrow = arr.length - 1, maxcol = arr[0].length - 1;
		int count = 1;
		int n = arr.length * arr[0].length;
		while (count <= n) {

			for (int i = minrow; i <= maxrow && count <= n; i++) {
				System.out.print(arr[i][mincol] + ", ");
				count++;
			}
			mincol++;
			for (int i = mincol; i <= maxcol && count <= n; i++) {
				System.out.print(arr[maxrow][i] + ", ");
				count++;
			}
			maxrow--;

			for (int i = maxrow; i >= minrow && count <= n; i--) {
				System.out.print(arr[i][maxcol] + ", ");
				count++;
			}
			maxcol--;

			for (int i = maxcol; i >= mincol && count <= n; i--) {
				System.out.print(arr[minrow][i] + ", ");
				count++;
			}
			minrow++;
		}
		System.out.println("END");
	}

	public static void multiply(int[][] arr, int[][] arr2) {
		int[][] arr3 = new int[3][3];
		if (arr[0].length == arr2.length) {
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[0].length; j++) {
					for (int k = 0; k < arr[0].length; k++) {
						arr3[i][j] = arr3[i][j] + (arr[i][k] * arr2[k][j]);
					}

				}
			}
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[0].length; j++) {
					System.out.print(arr3[i][j] + " ");
				}
				System.out.println();
			}

		}

	}
	public static void spiral_display_clockwise(int[][] arr) {
		int mincol = 0, minrow = 0, maxrow = arr.length - 1, maxcol = arr[0].length - 1;
		int count = 1;
		int n = arr.length * arr[0].length;
		while (count <= n) {

			for (int i = mincol; i <= maxcol && count <= n; i++) {
				System.out.print(arr[minrow][i] + ", ");
				count++;
			}
			minrow++;
			for (int i = minrow; i <= maxrow && count <= n; i++) {
				System.out.print(arr[i][maxcol] + ", ");
				count++;
			}
			maxcol--;

			for (int i = maxcol; i >= mincol && count <= n; i--) {
				System.out.print(arr[maxrow][i] + ", ");
				count++;
			}
			maxrow--;

			for (int i = maxrow; i >= minrow && count <= n; i--) {
				System.out.print(arr[i][mincol] + ", ");
				count++;
			}
			mincol++;
		}
		System.out.println("END");
	}

}
