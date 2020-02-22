package generic_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class generic {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList();
	}

	private Node root;

	public generic() {
		root = construct(null, -1);
	}

	private Node construct(Node parent, int ith) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data + " ?");
		}

		int item = scn.nextInt();

		Node nn = new Node();
		nn.data = item;

		System.out.println("No. of children for " + nn.data + " ?");
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {
		display(root);
	}

	private void display(Node node) {

		String str = node.data + " -> ";

		for (Node child : node.children) {
			str += child.data + ", ";
		}

		str += ".";
		System.out.println(str);

		for (Node child : node.children) {
			display(child);
		}
	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		int ts = 0;

		for (Node child : node.children) {
			int cs = size(child);
			ts += cs;
		}
		return ts + 1;
	}

	public int max() {
		return max(root, 0);
	}

	private int max(Node node, int large) {

		for (Node child : node.children) {
			if (child.data > large)
				large = child.data;
			large = max(child, large);

		}
		if (node.data > large)
			large = node.data;
		return large;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {
		if (node.data == item) {
			return true;
		}

		for (Node child : node.children) {
			boolean ans = find(child, item);
			if (ans == true)
				return true;
		}
		return false;
	}

	public int height() {
		return height(root);
	}

	public int height(Node node) {
		int curr = -1;
		for (Node child : node.children) {
			int height = height(child);
			if (height > curr) {
				curr = height;
			}
		}
		return curr + 1;
	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {
		swap(node);
		for (Node child : node.children) {

			mirror(child);

		}

	}

	private void swap(Node node) {
		for (int i = 0, j = node.children.size() - 1; i < node.children.size() / 2; i++, j--) {
			Node temp = node.children.get(i);
			node.children.set(i, node.children.get(j));
			node.children.set(j, temp);
		}

	}

	public void print_level(int level) {
		print_level(root, level, 0);
	}

	private void print_level(Node node, int level, int count) {

		if (count == level) {
			System.out.println(node.data);
			return;
		}
		for (Node child : node.children) {
			print_level(child, level, count + 1);
		}
	}

	public void linearize() {
		linearize(root);
	}

	public void linearize(Node node) {

		for (Node child : node.children) {
			linearize(child);
		}
		while (node.children.size() > 1) {
			Node temp = node.children.remove(1);
			Node tail = gettail(node.children.get(0));
			tail.children.add(temp);
		}
	}

	public Node gettail(Node node) {
		if (node.children.size() == 0) {
			return node;
		}
//		for(Node child:node.children) {
		return gettail(node.children.get(0));
//		}
//	return node;
	}

	public void preorder() {
		preorder(root);
	}

	public void preorder(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			preorder(child);
		}
	}

	public void level_order() {
		level_order(root);
	}

	public void level_order(Node node) {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (queue.size() != 0) {
			Node temp = queue.remove();
			System.out.println(temp.data);
			for (Node child : temp.children) {
				queue.add(child);
			}

		}

	}

	public void level_orderLW1() {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(root);
		queue.addLast(null);
		while (!queue.isEmpty()) {

			Node temp = queue.removeFirst();

			if (temp == null) {
				System.out.println();
				if (queue.isEmpty()) {
					break;
				}
				queue.addLast(null);
				continue;
			}
			System.out.print(temp.data + " ");

			for (Node child : temp.children) {
				queue.addLast(child);
			}

		}

	}

	public void levelOrderLW2() {

		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		queue.addLast(root);

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				helper.addLast(child);
			}

			if (queue.isEmpty()) {
				queue = helper;
				helper = new LinkedList<>();

				System.out.println();
			}

		}
	}

	public void levelOrderZZ() {
		LinkedList<Node> primaryS = new LinkedList<>();
		LinkedList<Node> helperS = new LinkedList<>();
		int c = 0;
		primaryS.addFirst(root);
		while (!primaryS.isEmpty()) {
			Node rn = primaryS.removeFirst();
			System.out.print(rn.data + " ");
			if (c % 2 == 0) {
				for (Node child : rn.children) {
					helperS.addFirst(child);
				}
			} else {
				for (int i = rn.children.size() - 1; i >= 0; i--) {
					helperS.addFirst(rn.children.get(i));
				}
			}
			if (primaryS.isEmpty()) {
				c++;
				primaryS = helperS;
				helperS = new LinkedList<>();
				System.out.println();
			}	
		}
	}
}