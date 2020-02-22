package dynamic_processing;

import java.util.Scanner;

public class edit_distance {
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	String s1= scn.next();
	String s2= scn.next();
//	System.out.println(edit_distance(s1, s2));
	int[][]arr=new int[s1.length()+1][s2.length()+1];
	edit_distanceBD(s1,s2,arr);

}

private static void edit_distanceBD(String s1, String s2, int[][] arr) { //TD
			
	for(int i=s1.length();i>=0;i--) {
		for(int j=s2.length();j>=0;j--) {
			if(i==s1.length()) {
				arr[i][j]=s2.length()-j;
				continue;
			}
			if(j==s2.length()) {
				arr[i][j]=s1.length()-i;
				continue;
			}
			if(s1.charAt(i)==s2.charAt(j)) {
				arr[i][j]=arr[i+1][j+1];
			}else {
				int v1=	arr[i+1][j]; //insert
				int v2=	arr[i][j+1];//delete
				int v3=	arr[i+1][j+1];//replace
				
				arr[i][j]=Math.min(v2,  Math.min(v1, v3))+1;
			}
		}	
	}	
	System.out.println(arr[0][0]);
			
}			

public static int edit_distance(String s1,String s2) {
	
	if(s1.length()==0 || s2.length()==0) {
		return Math.max(s1.length(), s2.length());
	}
	
	char ch1=s1.charAt(0);
	char ch2=s2.charAt(0);
	String ros1 = s1.substring(1);
	String ros2 = s2.substring(1);
	if(ch1==ch2) {
		return edit_distance(ros1, ros2);
	}else {
		
	int v1=	edit_distance(ros1, s2); //insert
	int v2=	edit_distance(s1, ros2);//delete
	int v3=	edit_distance(ros1, ros2);//replace
	
	 return Math.min(v2,  Math.min(v1, v3))+1;
	}
}	
public static int EditDistanceBU(String s1, String s2) {

	int[][] strg = new int[s1.length() + 1][s2.length() + 1];

	for (int row = s1.length(); row >= 0; row--) {

		for (int col = s2.length(); col >= 0; col--) {

			if (row == s1.length()) {
				strg[row][col] = s2.length() - col;
				continue;
			}

			if (col == s2.length()) {
				strg[row][col] = s1.length() - row;
				continue;
			}

			if (s1.charAt(row) == s2.charAt(col)) {
				strg[row][col] = strg[row + 1][col + 1];
			} else {

				int i = strg[row + 1][col];
				int d = strg[row][col + 1];
				int r = strg[row + 1][col + 1];

				strg[row][col] = Math.min(i, Math.min(d, r)) + 1;

			}

		}
	}

	return strg[0][0];

}
}	
