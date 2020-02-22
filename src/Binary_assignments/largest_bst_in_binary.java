package Binary_assignments;

import java.util.Scanner;

//import binary_tree.binary.node;

public class largest_bst_in_binary {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] pre = new int[n];
		int[] in = new int[n];
		for (int i = 0; i < pre.length; i++) {
			pre[i] = scn.nextInt();
		}
		for (int i = 0; i < pre.length; i++) {
			in[i] = scn.nextInt();
		}

		largest_bst_in_binary l = new largest_bst_in_binary(pre, in);
//		l.display();
		l.largest_bst();

	}

	private class node {
		int data;
		node left;
		node right;
	}

	private node root;

	public largest_bst_in_binary(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (ilo > ihi || plo > phi) {
			return null;
		}
		node nn = new node();
		nn.data = pre[plo];
		int nel = 0;
		int si = -1;
		for (int i = 0; i < pre.length; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}
			nel++;
		}

		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;
	}

	public int size() {
		return size(root);
	}

	private int size(node node) {
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;
	}

	public void display() {
		display(root);
	}

	private void display(node node) {
		if (node == null)
			return;
		String ans = "";
		if (node.left != null) {
			ans = node.left.data + "->" + node.data + "<-";
		} else {
			ans = "." + "->" + node.data + "<-";
		}
		if (node.right != null) {
			ans = ans + node.right.data;
		} else {
			ans = ans + ".";
		}
		System.out.println(ans);
		display(node.left);
		display(node.right);
	}

	private class BSTPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

	}

	public boolean isTreeBST() {
		return isTreeBST(root).isBST;
	}

	private BSTPair isTreeBST(node node) {

		if (node == null) {
			return new BSTPair();
		}

		BSTPair lbp = isTreeBST(node.left);
		BSTPair rbp = isTreeBST(node.right);

		BSTPair sbp = new BSTPair();

		if (lbp.isBST && rbp.isBST && node.data > lbp.max && node.data < rbp.min) {
			sbp.isBST = true;
		} else {
			sbp.isBST = false;
		}

		sbp.max = Math.max(node.data, rbp.max);
		sbp.min = Math.min(node.data, lbp.min);

		return sbp;
	}

	public void largest_bst() {
		largest_bst(root);
		System.out.println(val);
		System.out.println(s);
	}

	int val;
	int s;

	public void largest_bst(node node) {
		if (node == null) {
			return;
		}
		if (isTreeBST(node).isBST) {
			largest_bst(node.left);
			largest_bst(node.right);

			val = node.data;
			s = size(node);
		}
	}
}
