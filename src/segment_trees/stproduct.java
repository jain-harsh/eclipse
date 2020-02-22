package segment_trees;

public class stproduct implements segment_tree_I {

	@Override
	public int operation(int a, int b) {
		return a*b;
	}

	@Override
	public int defaultvalue() {
		// TODO Auto-generated method stub
		return 1;
	}

}
