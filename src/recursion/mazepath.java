package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class mazepath {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int endr=scn.nextInt();
		int endc=scn.nextInt();
		System.out.println(maze(0,0,endr,endc));
	}
	public static ArrayList<String> maze(int r,int c,int endr,int endc){
	if(r==endr && c==endc) {
		ArrayList<String> br = new ArrayList<>();
		br.add(" ");
		return br;
	}
	if(r>endr || c>endc) {
		ArrayList<String> br = new ArrayList<>();
		return br;
	}
	ArrayList<String> mr = new ArrayList<>();
	ArrayList<String> rrh = maze(r,c+1,endr,endc);

	for (String val : rrh) {
		mr.add("H" + val);
	}
	ArrayList<String> rrv = maze(r + 1, c, endr, endc);

	for (String val : rrv) {
		mr.add("V" + val);
	}
	return mr;
	}

}
