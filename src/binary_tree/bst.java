package binary_tree;

//import binary_tree.binary.node;

public class bst {

	private class node {
		int data;
		node left;
		node right;
	}

	private node root;

	public bst(int[] arr) {
		root = bst(arr, 0, arr.length - 1);
	}

	private node bst(int[] arr, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		node nn = new node();
		nn.data = arr[mid];
		nn.left = bst(arr, lo, mid - 1);
		nn.right = bst(arr, mid + 1, hi);
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
		if (node.right == null) {
			return node.data;
		}
		return max(node.right);
	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data < item) {
			return find(node.left, item);
		} else if (node.data > item) {
			return find(node.right, item);
		} else {
			return true;
		}
	}

	public void print_range(int n1, int n2) {
		print_range(root, n1, n2);
	}

	public void print_range(node node, int n1, int n2) {

		if (node == null) {
			return;
		}
		if (node.data >= n1 && node.data <= n2) {
			print_range(node.left, n1, n2);
			System.out.println(node.data);
			print_range(node.right, n1, n2);
		}
		if (node.data < n1) {
			print_range(node.right, n1, n2);
		}
		if (node.data > n2) {
			print_range(node.left, n1, n2);
		}
	}

	public void replace_large_sum() {
		int[] max = new int[1];
		replace_large_sum(root, max);
	}

	public void replace_large_sum(node node, int[] max) {
		if (node == null) {
			return;
		}

		replace_large_sum(node.right, max);
		int temp = node.data;
		node.data = max[0];
		max[0] = max[0] + temp;

		replace_large_sum(node.left, max);
	}

	public void add(int item) {
		if (root == null) {
			node a = new node();
			a.data = item;
			root = a;
		} else {
			add(root, item);
		}
	}

	private void add(node node, int item) {
		if (node.left == null && node.data > item) {
			node a = new node();
			a.data = item;
			node temp = node.left;
			node.left = a;
			a.left = temp;
			return;
		}
		if (node.right == null && node.data < item) {
			node a = new node();
			a.data = item;
			node temp = node.right;
			node.right = a;
			a.right = temp;
			return;
		}
		if (item >= node.data) {
			add(node.right, item);
		}
		if (item <= node.data) {
			add(node.left, item);
		}

	}

	public void addreturn(int item) {
		root = addreturn(root, item);
	}

	private node addreturn(node node, int item) {
		if (node == null) {
			node a = new node();
			a.data = item;
			return a;
		}
		if (item >= node.data) {
			node.left = addreturn(node.right, item);
		}
		if (item <= node.data) {
			node.right = addreturn(node.left, item);
		}
		return node;
	}

	public void remove(int item) {
		System.out.println("----------------");	
		if(root.data==item) {
			if(root.left!=null && root.right==null) {
				root=root.left;
			}
			else if(root.right!=null && root.left==null) {
				root=root.right;
			}
			else {
				remove(root, null, item);
			}
		}else 
		{
		remove(root, null, item);
		}
		}

	public void remove(node node, node parent, int item) {

		if (item > node.data) {
			 remove(node.right, node, item);
		} else if (item < node.data) {
			remove(node.left, node, item);
		} 
		else {

			if (node.left == null && node.right == null) {
				if (item <= parent.data) {
					parent.left = null;

				} else if (item >= parent.data) {
					parent.right = null;
				}

			}

			else if (node.left == null && node.right != null) {
				if (item <= parent.data) {
					parent.left = node.right;

				} else if (item >= parent.data) {
					parent.right = node.right;
				}

			} else if (node.left != null && node.right == null) {
				if (item <= parent.data) {
					parent.left = node.left;

				} else if (item >= parent.data) {
					parent.right = node.left;
				}
			} else {
				int val=max(node.left);
				node.data=val;
				remove(node.left,node,val);
			}

		}
	}
}
