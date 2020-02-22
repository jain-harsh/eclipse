package segment_trees;

public class segment {
	private class node {
		int data;
		int si;
		int ei;
		node left;
		node right;
	}

	private node root;

	private segment_tree_I si;

	public segment(int[] arr, segment_tree_I si) {
		this.si = si;
		root = construct(arr, 0, arr.length - 1);
	}

	public segment(int[] arr) {		
		root = construct(arr, 0, arr.length - 1);
	}

	private node construct(int[] arr, int lo, int hi) {

		node nn = new node();
		nn.si = lo;
		nn.ei = hi;
		if (lo == hi) {
			nn.data = arr[lo];
			return nn;
		}
		int mid = (lo + hi) / 2;
		nn.left = construct(arr, lo, mid);
		nn.right = construct(arr, mid + 1, hi);

		nn.data = si.operation(nn.right.data, nn.left.data);
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

	public int query(int qsi, int qei) {
		return query(root, qsi, qei);
	}

	private int query(node node, int qsi, int qei) {
		// full overlapping
		if (node.si >= qsi && node.ei <= qei) {
			return node.data;
		}
		// no overlapping
		else if (node.ei < qsi || node.si > qei) {
			return si.defaultvalue();
		} else {
			int ls = query(node.left, qsi, qei);
			int rs = query(node.right, qsi, qei);
			return si.operation(ls, rs);
		}
	}

	public void update(int idx, int item) {
		update(root, idx, item);
	}

	private void update(node node, int idx, int item) {

		if (node.si == idx && node.ei == idx) {
			node.data = item;
			return;
		} else if (idx >= node.si && idx <= node.ei) {
			update(node.left, idx, item);
			update(node.right, idx, item);
			node.data = si.operation(node.left.data, node.right.data);
		}
	}

}
