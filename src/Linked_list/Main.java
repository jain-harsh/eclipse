package Linked_list;

import java.util.*;
public class Main {
	static int sum=0;
	public static void main(String[] args) {

		Main m = new Main();
		GenericTree gt = m.new GenericTree();

		System.out.println(gt.sumOfNodes());

	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(new Scanner(System.in), null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
		}

		public int sumOfNodes() {
			return this.sumOfNodes(this.root);
		}
		
		private int sumOfNodes(Node node) {
			if(node.children.size()==0) {
				return 0;
			}
			for(Node child:node.children) {
				if(sum==0) {
					sum=node.data;
				}
				sum=sum+child.data;
				sumOfNodes(child);
			}
			return sum;
		}

	}

}
