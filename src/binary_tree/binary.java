package binary_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class binary {
	Scanner scn = new Scanner(System.in);

	private class node {
		int data;
		node left;
		node right;
	}

	private node root;

	public binary() {
		root = construct(null, false);
	}

	private node construct(node node, boolean ilc) {
		if (node == null) {
			System.out.println("enter root element");
		} else {
			if (ilc) {
				System.out.println("enter left element");
			} else {
				System.out.println("enter right element");
			}
		}
		node nn = new node();
		nn.data = scn.nextInt();

		System.out.println(nn.data + "is left element");
		ilc = scn.nextBoolean();

		if (ilc) {
			nn.left = construct(node, true);
		}

		System.out.println(nn.data + "is right element");
		ilc = scn.nextBoolean();

		if (ilc) {
			nn.right = construct(node, false);
		}
		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(node node) {
		if (node == null)
			return;
		String ans = "";
		if (node.left != null) {
			ans = node.left.data + "->" + node.data + "<-";
		} else {
			ans = "." + "->" + node.data + "<-";
		}
		if (node.right != null) {
			ans = ans + node.right.data;
		} else {
			ans = ans + ".";
		}
		System.out.println(ans);
		display(node.left);
		display(node.right);
	}

	public int size() {
		return size(root);
	}

	private int size(node node) {
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;
	}

	public int height() {
		return height(root);
	}

	private int height(node node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(node node) {
		if (node == null) {
			return 0;
		}
		int lh = max(node.left);
		int rh = max(node.right);

		return Math.max(node.data, Math.max(lh, rh));
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(node node, int item) {
		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}
		
		boolean ln = find(node.left, item);
		if (ln == true) {
			return true;
		}
		boolean rn = find(node.right, item);

		return ln || rn;
	}

	private class heapmover {
		int ans;
	}

	public int diameter1() {
		heapmover heap = new heapmover();
		diameter1(root, heap);
		return heap.ans;
	}

	public int diameter1(node node, heapmover mover) {
		if (node == null) {
			return -1;
		}
		int lh = diameter1(node.left, mover);
		int rh = diameter1(node.right, mover);
		int ans = lh + rh + 2;
		if (ans > mover.ans) {
			mover.ans = ans;
		}
		return Math.max(lh, rh) + 1;
	}

	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(node node) {
		if (node == null) {
			return 0;
		}

		int ld = diameter2(node.left);
		int rd = diameter2(node.right);

		int sp = height(node.left) + height(node.right) + 2;

		int ans = Math.max(sp, Math.max(ld, rd));

		return ans;
	}

	private class diapair {
		int h = -1;
		int d = 0;
	}

	public int diameter3() {

		return diameter3(root).d;
	}

	private diapair diameter3(node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return new diapair();
		}
		diapair ldp = diameter3(node.left);
		diapair rdp = diameter3(node.right);
		diapair obj = new diapair();

		int ld = ldp.h;
		int rd = rdp.h;

		int sdp = ld + rd + 2;

		obj.d = Math.max(sdp, Math.max(ld, rd));
		obj.h = Math.max(ld, rd) + 1;

		return obj;
	}

	public boolean is_balanced() {
		return is_balanced(root);
	}

	private boolean is_balanced(node node) {

		if (node == null) {
			return true;
		}

		boolean ld = is_balanced(node.left);
		if (ld == false) {
			return false;
		}
		boolean rd = is_balanced(node.right);

		int lh = height(node.left);
		int rh = height(node.right);
		int ans = lh - rh;
		if ((ans == 1 || ans == 0 || ans == -1) && rd) {
			return true;
		} else
			return false;
	}

	private class balpair {
		boolean b = true;
		int h = -1;
	}

	public boolean is_balanced2() {
		return is_balanced2(root).b;
	}

	private balpair is_balanced2(node node) {
		if (node == null) {
			return new balpair();
		}
		balpair ls = is_balanced2(node.left);
		balpair rs = is_balanced2(node.right);
		balpair bal = new balpair();
		int ans = ls.h - rs.h;
		if ((ans == 1 || ans == 0 || ans == -1) && ls.b && rs.b) {
			bal.b = true;
		} else
			bal.b = false;
		bal.h = Math.max(ls.h, rs.h) + 1;
		return bal;
	}

	public boolean flip_equiavent(binary bt1) {
		return flip(root, bt1.root);
	}

	private boolean flip(node n1, node n2) {
		// TODO Auto-generated method stub
		if (n1 == null && n2 == null) {
			return true;
		}
		if (n1 == null || n2 == null) {
			return false;
		}

		if (n1.data != n2.data) {
			return false;
		}

		boolean rr = flip(n1.right, n2.right);
		boolean ll = flip(n1.left, n2.left);
		boolean lr = flip(n1.left, n2.right);
		boolean rl = flip(n1.right, n2.left);

		return (rr && ll) || (lr && rl);
	}

	private class pair {
		node n;
		boolean sd = false;
		boolean ld = false;
		boolean rd = false;
	}

//	private pair n;

	public void preorder() {
		preorder(root);
	}

	private void preorder(node node) {

		Stack<pair> s = new Stack<>();
		pair fp = new pair();
		fp.n = root;
		s.push(fp);
		while (!s.isEmpty()) {
			pair tp = s.peek();
			if (tp.sd == false) {
				System.out.println(tp.n.data);
				tp.sd = true;

			} else if (tp.ld == false) {
				pair sp = new pair();
				sp.n = tp.n.left;
				if (sp.n != null) {
					s.push(sp);
				}
				tp.ld = true;

			} else if (tp.rd == false) {
				pair sp = new pair();
				sp.n = tp.n.right;
				if (sp.n != null) {
					s.push(sp);

				}
				tp.rd = true;
			} else
				s.pop();
		}
	}

	public int maxtreesum() {
		int[] maxsum = new int[1];
		maxtreesum(root, maxsum);
		return maxsum[0];
	}

	private int maxtreesum(node node, int[] maxsum) {
		if (node == null) {
			return 0;
		}
		int lh = maxtreesum(node.left, maxsum);
		int rh = maxtreesum(node.right, maxsum);
		int sum = lh + rh + node.data;
		if (maxsum[0] < sum) {
			maxsum[0] = sum;
		}
		return sum;
	}

	private class maxsum {
		int entiresum;
		int max;
	}

	public int maxsumtree2() {
		return maxsumtree2(root).max;
	}

	private maxsum maxsumtree2(node node) {
		if (node == null) {
			return new maxsum();
		}
		maxsum lh = maxsumtree2(node.left);
		maxsum rh = maxsumtree2(node.right);

		maxsum ssp = new maxsum();
		ssp.entiresum = lh.entiresum + rh.entiresum + node.data;
		ssp.max = Math.max(ssp.entiresum, Math.max(lh.max, rh.max));
		return ssp;
	}
	
	public binary(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (ilo > ihi || plo > phi) {
			return null;
		}
		node nn = new node();
		nn.data = pre[plo];
		int nel = 0;
		int si = -1;
		for (int i = 0; i < pre.length; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}
			nel++;
		}

		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;
	}
	
	private class BSTPair {
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

	}

	public boolean isTreeBST() {
		return isTreeBST(root).isBST;
	}

	private BSTPair isTreeBST(node node) {

		if (node == null) {
			return new BSTPair();
		}

		BSTPair lbp = isTreeBST(node.left);
		BSTPair rbp = isTreeBST(node.right);

		BSTPair sbp = new BSTPair();

		if (lbp.isBST && rbp.isBST && node.data > lbp.max && node.data < rbp.min) {
			sbp.isBST = true;
		} else {
			sbp.isBST = false;
		}

		sbp.max = Math.max(node.data, rbp.max);
		sbp.min = Math.min(node.data, lbp.min);

		return sbp;
	}

	public void largest_bst() {
		largest_bst(root);
		System.out.println(val);
		System.out.println(s);
	}

	int val;
	int s;

	public void largest_bst(node node) {
		if (node == null) {
			return;
		}
		if (isTreeBST(node).isBST) {
			largest_bst(node.left);
			largest_bst(node.right);

			val = node.data;
			s = size(node);
		}
	}

	private class VOPair implements Comparable<VOPair> {
		int val;
		int hlevel;
		int vlevel;

		public VOPair(int val, int hlevel, int vlevel) {
			this.val = val;
			this.hlevel = hlevel;
			this.vlevel = vlevel;
		}

		@Override
		public String toString() {
			return val + "";
		}

		@Override
		public int compareTo(VOPair o) {
			return this.hlevel - o.hlevel;
		}
	}

	public void verticaldisplay() {
		HashMap<Integer, ArrayList<VOPair>> map = new HashMap<>();
		verticaldisplay(root, map, 0, 0);

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		System.out.println(keys);
		for (int k : keys) {
			ArrayList<VOPair> list = map.get(k);
			Collections.sort(list);

			System.out.println(k + " -> " + list);
		}

//		System.out.println(map);

	}

	private void verticaldisplay(node node, HashMap<Integer, ArrayList<VOPair>> map, int h, int v) {
		if (node == null) {
			return;
		}
		if (!map.containsKey(v)) {
			map.put(v, new ArrayList<>());
		}
		VOPair np = new VOPair(node.data, h, v);
		map.get(v).add(np);

		verticaldisplay(node.left, map, h + 1, v - 1);
		verticaldisplay(node.right, map, h + 1, v + 1);
	}
}
