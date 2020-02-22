package Binary_assignments;

import java.util.*;

public class create_pre_in {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		create_pre_in m = new create_pre_in();
		int[] pre = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(pre, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}

			Node nn = new Node();
			nn.data = post[plo];
			int nel = 0;
			int c = -1;
			for (int i = 0; i < post.length; i++) {
				if (in[i] == post[plo]) {
					c = i;
					break;
				}
				nel++;
			}

			nn.left = construct(post, plo + 1, plo + nel, in, ilo, c - 1);
			nn.right = construct(post, plo + nel, phi, in, c + 1, ihi);

			return nn;

		}

//		public BinaryTree(int[] pre, int[] in) {
//			this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
//		}	
//			
//		private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
//			if (ilo > ihi || plo > phi) {
//				return null;
//			}
//			
//			Node nn=new Node();
//			nn.data=pre[plo];
//			int nel=0;
//			int c=-1;
//			for(int i=0;i<pre.length;i++) {
//				if(in[i]==pre[plo]) {
//					c=i;
//					break;
//				}
//				nel++;
//			}
//			
//			nn.left=construct(pre, plo+1, plo+nel, in, ilo, c-1);
//			nn.right=construct(pre, plo+nel, phi, in, c+1, ihi);
//			
//			return nn;
//		}	

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}
		
	}

}
