package Binary_assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class print_leaf_nodes {

	Scanner scn = new Scanner(System.in);

	private class node {
		int data;
		node left;
		node right;
	}

	private node root;

	public print_leaf_nodes() {
		root=construct(null);
	}

	private node construct(node node) {
		
		node nn=new node();
		int n=scn.nextInt();
		nn.data=n;
		if(n==-1) {
			return null;
		}
		
		nn.left=construct(node);
		nn.right=construct(node);
		
		return null;
	}

}
