package Linked_list;

import java.util.*;

class Queue {

	protected int size;

	protected int front;
	protected int[] data;

	public Queue() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Queue(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.print("END");
	}

	public static void hoodies(int q) throws Exception {
		Queue q1 = new Queue(10000);
		Queue q2 = new Queue(10000);
		Queue q3 = new Queue(10000);
		Queue q4 = new Queue(10000);
		char[] arr = new char[q];
		for (int i = 0; i < arr.length; i++) {
			String str = scn.next();
			arr[i] = str.charAt(0);
			if (arr[i] == 'E') {
				int c = scn.nextInt();
				int r = scn.nextInt();
				if (c == 1) {
					q1.enqueue(c);
					q1.enqueue(r);
				} else if (c == 2) {
					q2.enqueue(c);
					q2.enqueue(r);
				} else if (c == 3) {
					q3.enqueue(c);
					q3.enqueue(r);
				} else {
					q4.enqueue(c);
					q4.enqueue(r);
				}

			} else {
				if (!q1.isEmpty()) {
					System.out.print(q1.dequeue() + " ");
					System.out.println(q1.dequeue());
				} else if (!q2.isEmpty()) {
					System.out.print(q2.dequeue() + " ");
					System.out.println(q2.dequeue());
				} else if (!q3.isEmpty()) {
					System.out.print(q3.dequeue() + " ");
					System.out.println(q3.dequeue());
				} else if (!q4.isEmpty()) {
					System.out.print(q4.dequeue() + " ");
					System.out.println(q4.dequeue());
				}
			}
		}
	}
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		int n = scn.nextInt();

		hoodies(n);
	}
}
