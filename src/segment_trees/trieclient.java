package segment_trees;

public class trieclient {
public static void main(String[] args) {
	Trie t=new Trie();
	t.addword("see");
	t.addword("an");
	t.addword("and");
	t.addword("seen");
	t.addword("sea");
//	t.display();
//	System.out.println(t.searchword("se"));
	t.removeword("seen");
	t.display();
}
}
