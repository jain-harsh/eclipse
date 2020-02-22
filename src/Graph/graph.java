package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class graph {
	private int numv;
	private int[][] matrix;

	public graph(int v) {
		numv = v;
		matrix = new int[numv + 1][numv + 1];
	}

	public void addedge(int u, int v, int cost) {
		matrix[u][v] = cost;
		matrix[v][u] = cost;
	}

	public int removeedge(int u, int v) {
		int temp = matrix[u][v];
		matrix[u][v] = 0;
		matrix[u][v] = 0;

		return temp;
	}

	public int numedge() {
		int count = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] != 0) {
					count++;
				}
			}
		}
		return count / 2;
	}

	public boolean containsedge(int u, int v) {
		return matrix[u][v] != 0;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 1; i < matrix.length; i++) {
			str += "\n";
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] != 0) {
					str += i + "[" + j + "],";
				}
			}
		}
		return str;
	}

	public boolean haspath(int src, int des, HashMap<Integer, Boolean> map) {

		map.put(src, true);

		if (src == des) {
			return true;
		}

		for (int nbr = 1; nbr < matrix.length; nbr++) {
			if (matrix[src][nbr] != 0 && !map.containsKey(nbr)) {

				boolean ans = haspath(nbr, des, map);
				if (ans) {
					return true;
				}
			}

		}
		return false;

	}

	public void printallpath(int src, int des, HashMap<Integer, Boolean> map, String str) {

		map.put(src, true);

		if (src == des) {
			System.out.println(str + des);
			map.remove(src);
			return;
		}
		for (int nbr = 1; nbr < matrix.length; nbr++) {
			if (matrix[src][nbr] != 0 && !map.containsKey(nbr)) {

				printallpath(nbr, des, map, str + src);
//				map.put(src,false);
			}

		}
		map.remove(src);
	}

	private class pair {
		int vname;
		String str;
		String color;

		public pair(int vname, String str) {
			this.vname = vname;
			this.str = str;
		}

		public pair(int vname, String str,String color) {
			this.vname = vname;
			this.str = str;
			this.color=color;
		}
	}

	public boolean breathfirstsearch(int src, int des) {
		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		pair sp = new pair(src, src + "");
//		queue.remove(sp);
		queue.addLast(sp);
		while (!queue.isEmpty()) {

			pair rp = queue.removeFirst();
			if (map.containsKey(rp.vname)) {
				continue;
			}
			map.put(rp.vname, true);
			if (rp.vname == des) {
				System.out.println(rp.str);
				return true;
			}
			for (int nbr = 1; nbr < matrix.length; nbr++) {
				if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
					pair np = new pair(nbr, rp.str + nbr);
					queue.addLast(np);
				}
			}
		}
		return false;
	}

	public boolean depthfirstsearch(int src, int des) {
		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		pair sp = new pair(src, src + "");
//		queue.remove(sp);
		stack.addFirst(sp);
		while (!stack.isEmpty()) {

			pair rp = stack.removeFirst();
			if (map.containsKey(rp.vname)) {
				continue;
			}
			map.put(rp.vname, true);
			if (rp.vname == des) {
				System.out.println(rp.str);
				return true;
			}
			for (int nbr = 1; nbr < matrix.length; nbr++) {
				if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
					pair np = new pair(nbr, rp.str + nbr);
					stack.addFirst(np);
				}
			}
		}
		return false;
	}

	public void bft() {
		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 1; i < matrix[0].length; i++) {
			if (map.containsKey(i)) {
				continue;
			}
			pair sp = new pair(i, i + "");
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

				if (map.containsKey(rp.vname)) {
					continue;
				}
				map.put(rp.vname, true);

				System.out.println(rp.vname + " coming via" + rp.str);
				for (int nbr = 1; nbr < matrix.length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
						pair np = new pair(nbr, rp.str + nbr);
						queue.addLast(np);
					}
				}
			}
		}

	}

	public void dft() {
		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 1; i < matrix[0].length; i++) {
			if (map.containsKey(i)) {
				continue;
			}
			pair sp = new pair(i, i + "");
			stack.addFirst(sp);
			while (!stack.isEmpty()) {
				pair rp = stack.removeFirst();

				if (map.containsKey(rp.vname)) {
					continue;
				}
				map.put(rp.vname, true);
				System.out.println(rp.vname + " coming via" + rp.str);
				for (int nbr = 1; nbr < matrix.length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
						pair np = new pair(nbr, rp.str + nbr);
						stack.addFirst(np);
					}
				}
			}
		}
	}
	
	public boolean iscyclic() {
		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 1; i < matrix[0].length; i++) {
			if (map.containsKey(i)) {
				return true;
			}
			pair sp = new pair(i, i + "");
			stack.addFirst(sp);
			while (!stack.isEmpty()) {
				pair rp = stack.removeFirst();

				if (map.containsKey(rp.vname)) {
					continue;
				}
				map.put(rp.vname, true);
//				System.out.println(rp.vname + " coming via" + rp.str);
				for (int nbr = 1; nbr < matrix.length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
						pair np = new pair(nbr, rp.str + nbr);
						stack.addFirst(np);
					}
				}
			}
		}
		return false;
	}
	
	public boolean isconnected() {
		LinkedList<pair> stack = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		int count=0;
		for (int i = 1; i < matrix[0].length; i++) {
			if (map.containsKey(i)) {
				continue;
			}
			count++;
			pair sp = new pair(i, i + "");
			stack.addFirst(sp);
			while (!stack.isEmpty()) {
				pair rp = stack.removeFirst();

				if (map.containsKey(rp.vname)) {
					continue;
				}
				map.put(rp.vname, true);
//				System.out.println(rp.vname + " coming via" + rp.str);
				for (int nbr = 1; nbr < matrix.length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
						pair np = new pair(nbr, rp.str + nbr);
						stack.addFirst(np);
					}
				}
			}
		}
		return count==1;
	}
	
	public boolean istree() {
		return !iscyclic() && isconnected();
	}
	
	public ArrayList<ArrayList<Integer>> getCC(){
		ArrayList<ArrayList<Integer>> total=new ArrayList<>();
		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 1; i < matrix[0].length; i++) {
			if (map.containsKey(i)) {
				continue;
			}
			ArrayList<Integer> child=new ArrayList<>();
			pair sp = new pair(i, i + "");
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

				if (map.containsKey(rp.vname)) {
					continue;
				}
				map.put(rp.vname, true);

				child.add(rp.vname);
//				System.out.println(rp.vname + " coming via" + rp.str);
				for (int nbr = 1; nbr < matrix.length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
						pair np = new pair(nbr, rp.str + nbr);
						queue.addLast(np);
					}
				}
			}
			total.add(child);
		}
	return total;
	}
	
	public boolean isbipartite() {

		LinkedList<pair> queue = new LinkedList<>();
		HashMap<Integer, String> map = new HashMap<>();
		

		for (int i = 1; i < matrix[0].length; i++) {
			if (map.containsKey(i)) {
				continue;
			}
			pair sp = new pair(i, i + "","R");
			queue.addLast(sp);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

				if (map.containsKey(rp.vname)) {
					String oc=map.get(rp.vname);
					String nc=rp.color;
					if(!oc.equals(nc)) {
						return false;
					}
					
					continue;
				}
				map.put(rp.vname, rp.color);

//				System.out.println(rp.vname + " coming via" + rp.str);
				for (int nbr = 1; nbr < matrix.length; nbr++) {
					if (matrix[rp.vname][nbr] != 0 && !map.containsKey(nbr)) {
						String c=rp.color.equals("R")?"G":"R";
						pair np = new pair(nbr, rp.str + nbr,c);
						queue.addLast(np);
					}
				}
			}
		}
		return true;
	}
	private class primspair implements Comparable<primspair> {
		int vname;
		int cost;
		int acno;
		
		@Override
		public int compareTo(primspair o) {
			return o.cost-this.cost;
		}
	}
			
	
}
