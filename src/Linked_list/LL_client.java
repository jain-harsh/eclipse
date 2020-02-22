package Linked_list;

import java.util.Scanner;

public class LL_client {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		linkedlist l = new linkedlist();
//		l.addlast(10);
//		l.addlast(20);
//		l.addlast(30);
//		l.addlast(40);
//		l.addfirst(50);
//		l.addfirst(60);
//		l.display();
//	l.display();
//	l.addat(0, 50);
//	l.display();
//	l.addat(2, 30);
//	l.display();
//	System.out.println(l.removefirst());
//	l.display();
//	System.out.println(l.removelast());
//	l.display();

//	l.reverse_data_swap();
//	l.display();
//	l.reverse_data_swap();
//	l.recursion_idx_call();
//		l.recursion_data_call();
//		l.display();
//		l.call_fold();
//		System.out.println(l.mid());
//		System.out.println(l.k_from_last(3));
//		l.display();
//		l.createDummyList();
//		System.out.println(l.floyd());
//		l.display();
//		l.k_reverse(3);
//		l.display();
//		LinkedList ll = new LinkedList();
		int n = scn.nextInt();

		for (int j = 0; j < n; j++) {
			int item = scn.nextInt();
			l.addlast(item);
		}

		l.partition();
		l.display();
	}
}
