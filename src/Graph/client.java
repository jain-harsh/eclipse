package Graph;

import java.util.HashMap;

public class client {
public static void main(String[] args) {
	graph g=new graph(7);
	g.addedge(1, 2, 1);
	g.addedge(1, 4, 1);
	g.addedge(4, 3, 1);
	g.addedge(2, 3, 1);
	g.addedge(4, 5, 1);
	g.addedge(5, 6, 1);
	g.addedge(5, 7, 1);
	g.addedge(7, 6, 1);
//	g.removeedge(2, 3);
	g.removeedge(6, 7);
	
//	System.out.println(g.containsedge(1, 2));
//	System.out.println(g);
//	System.out.println(g.haspath(1,4,new HashMap<>()));
//	g.printallpath(1, 6, new HashMap<>(), "");
//	System.out.println(g.breathfirstsearch(1,6));
//	System.out.println(g.depthfirstsearch(1, 6));
//	g.bft();
//	g.dft();
	System.out.println(g.istree());
	System.out.println(g.isconnected());
	System.out.println(g.iscyclic());
	System.out.println(g.getCC());
	System.out.println(g.isbipartite());
}
}
