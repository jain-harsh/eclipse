package segment_trees;

public class stsum implements segment_tree_I {

	@Override
	public int operation(int a, int b) {
		return a+b;
	}

	@Override
	public int defaultvalue() {
		return 0;
	}

}
