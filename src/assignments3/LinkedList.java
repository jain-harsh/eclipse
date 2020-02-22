package assignments3;

import java.util.*;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public LinkedList(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	// O(1)
	public int size() {
		return this.size;
	}

	// O(1)
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// O(1)
	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.tail.data;
	}

	// O(N)
	public int getAt(int idx) throws Exception {
		Node temp = this.getNodeAt(idx);
		return temp.data;
	}

	// O(N)
	private Node getNodeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		Node retVal = this.head;
		for (int i = 0; i < idx; i++) {
			retVal = retVal.next;
		}

		return retVal;
	}

	// O(1)
	public void addFirst(int data) {
		Node node = new Node(data, this.head);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.head = node;
		}

		this.size++;
	}

	// O(1)
	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	// O(n)
	public void addAt(int idx, int data) throws Exception {
		if (idx < 0 || idx > this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			this.addFirst(data);
		} else if (idx == this.size()) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;

			Node node = new Node(data, n);
			nm1.next = node;

			this.size++;
		}
	}

	// O(1)
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.head.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}

		this.size--;
		return retVal;
	}

	// O(n)
	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.tail.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node sm2 = this.getNodeAt(this.size() - 2);
			sm2.next = null;
			this.tail = sm2;
		}

		this.size--;
		return retVal;
	}

	// O(n)
	public int removeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size() - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			this.size--;

			return n.data;
		}
	}

	// O(n)
	public void display() {
		Node node = this.head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void delete_nodes(int n) throws Exception {
		LinkedList l = new LinkedList();
		while (this.size - 1 != 0) {
			int val1 = this.removeFirst();
			int val2 = this.getFirst();
			if (val1 > val2) {
				l.addLast(val1);
			}
		}
		l.addLast(this.removeFirst());
		l.display();
	}

	public void delete_nodes() throws Exception {
		LinkedList l = new LinkedList();
		while (this.size != 0) {
			int count = 0;
			int val = this.removeFirst();
			LinkedList l2 = new LinkedList();
			while (this.size != 0) {
				int val1 = this.removeFirst();
				l2.addLast(val1);

				if (val1 > val) {
					count = 1;
				}
				if (this.size == 0 && count == 0) {
					l.addLast(val);
				}
			}
			this.head = l2.head;
			this.tail = l2.tail;
			this.size = l2.size;
			if (l2.size == 1) {
				l.addLast(l2.removeFirst());
			}

		}
		l.display();
	}

	public boolean palindrome() throws Exception {
		int n = this.size;
		for (int i = 0; i < n / 2; i++) {
			int val1 = this.getFirst();
			int val2 = this.getLast();
			if (val1 == val2) {
				this.removeFirst();
				this.removeLast();
			} else {
				return false;
			}
		}
		return true;
	}

	public void fold() throws Exception {
		LinkedList l = new LinkedList();
		while (this.size != 0) {
			l.addLast(this.removeFirst());
			if (this.size != 0)
				l.addLast(this.removeLast());
		}
		l.display();
	}

	private void triplet(LinkedList list2, LinkedList list3, int target) throws Exception {
		int count = 0;
		while (this.size != 0 && count == 0) {
			int val1 = this.removeFirst();
			LinkedList l1 = new LinkedList();
			while (list2.size != 0 && count == 0) {
				int val2 = list2.removeFirst();
				l1.addLast(val2);
				LinkedList l2 = new LinkedList();
				while (list3.size != 0 && count == 0) {
					int val3 = list3.removeFirst();
					l2.addLast(val3);
					if (val1 + val2 + val3 == target) {
						System.out.println(val1 + " " + val2 + " " + val3);
						count = 1;
					}
				}
				list3.head = l2.head;
				list3.tail = l2.tail;
				list3.size = l2.size;
			}
			list2.head = l1.head;
			list2.tail = l1.tail;
			list2.size = l1.size;

		}
	}

	public void remove_duplicates() throws Exception {
		LinkedList l2 = new LinkedList();
		int n=this.size;
		while(!this.isEmpty()) {
			LinkedList l = new LinkedList();
			int val = this.removeFirst();
			l2.addLast(val);
			while (!this.isEmpty()) {
				int v = this.removeFirst();
				l.addLast(v);
				if (v == val)
					l.removeLast();

			}
			this.head = l.head;
			this.tail = l.tail;
			this.size = l.size;
		}
		l2.display();

	}

	private void sum(LinkedList other) throws Exception {
		LinkedList l = new LinkedList();
		int val3 = 0;
		while (this.size != 0 || other.size != 0) {
			int val1 = 0;
			int val2 = 0;
			if (this.size != 0) {
				val1 = this.removeLast();
			}
			if (other.size != 0) {
				val2 = other.removeLast();
			}
			val3 += val1 + val2;
			int n = val3 % 10;
			val3 = val3 / 10;
			l.addFirst(n);

		}
		if (val3 != 0) {
			l.addFirst(val3);
		}
		l.display();
	}

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
//		int N = scn.nextInt();
		// int M = scn.nextInt();
		LinkedList list1 = new LinkedList();
//		LinkedList list2 = new LinkedList();
//		LinkedList list3 = new LinkedList();
		int n1 = scn.nextInt();
//		int n2 = scn.nextInt();
//		int n3 = scn.nextInt();
		for (int i = 0; i < n1; i++) {
			int item = scn.nextInt();
			list1.addLast(item);
		}
		list1.remove_duplicates();
//		for (int i = 0; i < n2; i++) {
//			int item = scn.nextInt();
//			list2.addLast(item);
//		}
////		list1.sum(list2);
//		for (int i = 0; i < n3; i++) {
//			int item = scn.nextInt();
//			list3.addLast(item);
//		}
//		int target = scn.nextInt();
//		list1.triplet(list2, list3, target);
//		int t= scn.nextInt();
//		while(t-->0) {
//			int n=scn.nextInt();
//			LinkedList list1 = new LinkedList();
//			for (int i = 0; i < n; i++) {
//				int item = scn.nextInt();
//				list1.addLast(item);
//			}
//			list1.fold();
//		}

	}

}
