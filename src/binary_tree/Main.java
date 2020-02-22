package binary_tree;

import java.util.*;

//import Binary_assignments.create_pre_in.BinaryTree.Node;

public class Main {

	static Scanner scn = new Scanner(System.in);

//10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
//		bt.sibling();
//		System.out.println(bt.isBalanced());
//		System.out.println(bt.levelArrayList());
//		bt.levelOrderNewLine();
//		bt.levelOrderZZ();
//		System.out.println(bt.sumOfNodes());
//		Main m = new Main();
//		BinaryTree bt1 = m.new BinaryTree();
//		BinaryTree bt2 = m.new BinaryTree();
//		System.out.println(bt1.structurallyIdentical(bt2));
//		System.out.println(bt.isBalanced());
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

		public int sumOfNodes() {
			return this.sumOfNodes(this.root);
		}

		private int sumOfNodes(Node node) {

			if (node == null) {
				return 0;
			}
			int left = 0;
			int right = 0;

			left = sumOfNodes(node.left);

			right = sumOfNodes(node.right);

			int sum = node.data + left + right;

			return sum;

		}

		public boolean structurallyIdentical(BinaryTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node tnode, Node onode) {

			if (tnode == null && onode == null) {
				return true;
			}
			if (tnode == null || onode == null) {
				return false;
			}

			boolean left = structurallyIdentical(tnode.left, onode.left);
			boolean right = structurallyIdentical(tnode.right, onode.right);

			return left && right;

		}

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) {
			if (node == null) {
				return new BalancedPair();
			}

			BalancedPair left = isBalanced(node.left);
			BalancedPair right = isBalanced(node.right);
			BalancedPair nc = new BalancedPair();
			int ans = left.height - right.height;
			if ((ans == 1 || ans == 0 || ans == -1) && left.isBalanced && right.isBalanced) {
				nc.isBalanced = true;
			} else {
				nc.isBalanced = false;
			}
			nc.height = Math.max(left.height, right.height) + 1;
			return nc;

		}

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

		public ArrayList<ArrayList<Integer>> levelArrayList() {
			ArrayList<ArrayList<Integer>> na = new ArrayList<>();
			ArrayList<Integer> arr = new ArrayList<>();
			LinkedList<Node> q = new LinkedList<Node>();
			q.addLast(root);
			q.addLast(null);
			while (!q.isEmpty()) {

				Node temp = q.removeFirst();

				if (temp == null) {
					if (q.isEmpty()) {
						break;
					}
					q.addLast(null);

					na.add(arr);
					arr = new ArrayList<>();
					continue;
				}
				if (temp.left != null)
					q.addLast(temp.left);
				if (temp.right != null)
					q.addLast(temp.right);
				arr.add(temp.data);
			}
			na.add(arr);
			return na;
		}

//		public void sibling() {
//			LinkedList ll = new LinkedList();
//			this.sibling(this.root, ll, null);
//			while (!ll.isEmpty()) {
//				System.out.println(ll.remove());
//			}
//
//		}
//
//		private void sibling(Node node, LinkedList ll, Node parent) {
//			if (node == null) {
////				System.out.println(node.data);
//				ll.addFirst(parent.data);
//				return;
//			}
//			sibling(node.left, ll, node);
//			sibling(node.right, ll, node);
//
//		}
		public void sibling() {
			this.sibling(this.root);
		}

		private void sibling(Node node) {
			if (node == null) {
				return;
			}
			if (node.left != null && node.right == null) {
				System.out.print(node.left.data + " ");
			}
			if (node.left == null && node.right != null) {
				System.out.print(node.right.data + " ");
			}
			sibling(node.left);
			sibling(node.right);
		}

		public void levelOrderNewLine() {
			LinkedList<Node> q = new LinkedList<Node>();
			q.addLast(root);
			q.addLast(null);
			while (!q.isEmpty()) {
				Node temp = q.removeFirst();

				if (temp == null) {
					if (q.isEmpty()) {
						break;
					}
					q.addLast(null);
					System.out.println();
					continue;
				}
				System.out.print(temp.data + " ");
				if (temp.left != null)
					q.addLast(temp.left);
				if (temp.right != null)
					q.addLast(temp.right);

			}

		}

		public void levelOrderZZ() {
			LinkedList<Node> p = new LinkedList<Node>();
			LinkedList<Node> h = new LinkedList<Node>();	
			int count = 0;
			p.addLast(root);
			while (!p.isEmpty()) {
				Node temp = p.removeFirst();
				System.out.print(temp.data + " ");
				if (count % 2 != 0) {
					if (temp.left != null)
						h.addFirst(temp.right);
					if (temp.right != null)
						h.addFirst(temp.left);
				}
				else {
					if (temp.right != null)
						h.addLast(temp.right);
					if (temp.left != null)
						h.addLast(temp.left);
				}
				if(p.isEmpty()) {
					count++;
					p=h;
					h=new LinkedList<>();
				}
			}
		}
		
	}
}
