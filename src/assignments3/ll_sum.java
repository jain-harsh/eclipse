package assignments3;

import Linked_list.linkedlist.node;

public class ll_sum {
public static void main(String[] args) {
	
	
}

private class node {
	int data;
	node next;

	public node(int item) {
		this.data = item;
	}

	public node() {
	}
}

private node head;
public node tail;
private int size;

public void display() throws Exception {

	if (size == 0) {
		throw new Exception("LL is EMPTY");
	}
	node temp = head;

	while (temp != null) {
		System.out.print(temp.data + " ");
		temp = temp.next;
	}
	System.out.println();

}

public void addlast(int item) {
	node nn = new node();

	nn.data = item;
	nn.next = null;
	if (size > 0) {
		tail.next = nn;
		tail = nn;
		size++;
	}

	if (size == 0) {
		head = tail = nn;
		size++;
	}

}
}
