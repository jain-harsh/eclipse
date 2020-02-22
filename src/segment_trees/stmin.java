package segment_trees;

public class stmin implements segment_tree_I{

	@Override
	public int operation(int a, int b) {
		return Math.min(a, b);
	}

	@Override
	public int defaultvalue() {
		// TODO Auto-generated method stub
		return Integer.MAX_VALUE;
	}

}
