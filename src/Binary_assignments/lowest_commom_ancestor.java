package Binary_assignments;

import java.util.Scanner;

public class lowest_commom_ancestor {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		lowest_commom_ancestor m = new lowest_commom_ancestor();
		BinaryTree bt = m.new BinaryTree();
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		private class pair {
			int min = Integer.MAX_VALUE;
			int parent;

		}

		public int LCA(int num1, int num2) {
			return LCA(root, num1, num2);
		}

		private int LCA(Node node, int num1, int num2) {
			if (node.data == num1 || node.data == num2) {
				return node.data;
			}
			if (node == null) {
				return Integer.MAX_VALUE;
			}
			
			pair nn = new pair();
			nn.parent = node.data;
			
			int val1 = LCA(node.left, num1, num2);
			int val2 = LCA(node.right, num1, num2);
			
			if (val1 == num1 || val2 == num1) {
				
				nn.min=num1;
			}
			else if(val1 == num1 || val2 == num2) {
				nn.min=num2;
			}
			else
				nn.min=Integer.MAX_VALUE;

			
			return nn.min;
		}
		
	}
}
