package assignments3;

import java.util.Scanner;

public class merge_sorted_ll {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int t = scn.nextInt();

		while (t > 0) {

			LinkedList2 list1 = new LinkedList2();
			int n1 = scn.nextInt();

			for (int j = 0; j < n1; j++) {
				int item = scn.nextInt();
				list1.addLast(item);
			}

			LinkedList2 list2 = new LinkedList2();
			int n2 = scn.nextInt();

			for (int j = 0; j < n2; j++) {
				int item = scn.nextInt();
				list2.addLast(item);
			}
			list1.merge_sorted_list(list2);

			t--;
		}
	}
}

class LinkedList2 {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	public void merge_sorted_list(LinkedList2 other) throws Exception {
		LinkedList2 ans = new LinkedList2();
		while (other.size != 0 || this.size != 0) {
			if (other.size != 0 && this.size != 0) {
				
				int val1=this.removeFirst();
				int val2=other.removeFirst();
				if (val2 < val1) {
					ans.addLast(val2);
					this.addFirst(val1);
				} else  {
					ans.addLast(val1);
					other.addFirst(val2);
				}
			} 
			else if (other.size == 0) {
				ans.addLast(this.removeFirst());
			} else if (this.size == 0) {
				ans.addLast(other.removeFirst());
			}

		}
		ans.display();
	}
	
	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
