package segment_trees;

import java.util.HashMap;

public class Trie {
	private class node {
		char ch;
		boolean eow;
		HashMap<Character, node> map = new HashMap<>();

		public node(char ch) {
			this.ch = ch;
		}
	}

	private node root;

	public Trie() {
		root = new node('*');
	}

	public void addword(String word) {
		addword(root, word);
	}

	private void addword(node node, String str) {

		if (str.length() == 0) {
			node.eow = true;
			return;
		}
		char ch = str.charAt(0);
		String row = str.substring(1);
		if (node.map.containsKey(ch)) {
			node child = node.map.get(ch);
			addword(child, row);
		} else {
			node nn = new node(ch);
			node.map.put(ch, nn);
			addword(nn, row);
		}
	}

	public void display() {
		display(root, "");
	}

	private void display(node node, String str) {

		if (node.eow == true) {
			System.out.println(str);
		}
		for (char ch : node.map.keySet()) {
			display(node.map.get(ch), str + ch);
		}
	}

	public boolean searchword(String word) {
		return searchword(root, word);
	}

	private boolean searchword(node node, String str) {
		if (str.length() == 0) {
			return node.eow;
		}
		char ch = str.charAt(0);
		String row = str.substring(1);
		if (node.map.containsKey(ch)) {
			node child = node.map.get(ch);
			return searchword(child, row);
		} else {
			return false;
		}
	}

	public void removeword(String word) {
		removeword(root, word);
	}

	private void removeword(node node, String str) {
		if (str.length() == 0) {
			node.eow=false;
			return;
		}

		char ch = str.charAt(0);
		String row = str.substring(1);
		if (node.map.containsKey(ch)) {
			node child = node.map.get(ch);
			removeword(child, row);

		if (child.map.size() == 0 && child.eow == false) {
				child.map.remove(ch);
			}
		}
	}
}
