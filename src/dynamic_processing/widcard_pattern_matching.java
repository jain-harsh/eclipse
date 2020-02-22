package dynamic_processing;

public class widcard_pattern_matching {
	public static void main(String[] args) {

		String str = "baaabab";
		String pattern = "************************?";
//	System.out.println(wildcard(str,pattern));
//	System.out.println(wildcardTD(str, pattern, new int[str.length()+1][pattern.length()+1]));
		System.out.println(wildcardBU(str, pattern));

	}

	private static boolean wildcard(String str, String pattern) {
		if (str.length() == 0 && pattern.length() == 0) {
			return true;
		}
		if (str.length() != 0 && pattern.length() == 0) {
			return false;
		}
		if (str.length() == 0 && pattern.length() != 0) {
			for (int i = 0; i < pattern.length(); i++) {
				if (pattern.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		char chs = str.charAt(0);
		char pas = pattern.charAt(0);

		String ros = str.substring(1);
		String rop = pattern.substring(1);
		boolean ans;
		if (pas == '?' || chs == pas) {
			ans = wildcard(ros, rop);
		} else if (pattern.charAt(0) == '*') {
			boolean blank = wildcard(str, rop);
			boolean multiple = wildcard(ros, pattern);

			ans = blank || multiple;
		} else {
			return false;
		}
		return ans;
	}

	private static boolean wildcardTD(String str, String pattern, int[][] strg) {
		if (str.length() == 0 && pattern.length() == 0) {
			return true;
		}
		if (str.length() != 0 && pattern.length() == 0) {
			return false;
		}
		if (str.length() == 0 && pattern.length() != 0) {
			for (int i = 0; i < pattern.length(); i++) {
				if (pattern.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		if (strg[str.length()][pattern.length()] != 0) {
			return strg[str.length()][pattern.length()] == -1 ? false : true;
		}
		char chs = str.charAt(0);
		char pas = pattern.charAt(0);

		String ros = str.substring(1);
		String rop = pattern.substring(1);
		boolean ans;
		if (pattern.charAt(0) == '?' || chs == pas) {
			ans = wildcardTD(ros, rop, strg);
		} else if (pattern.charAt(0) == '*') {
			boolean blank = wildcardTD(str, rop, strg);
			boolean multiple = wildcardTD(ros, pattern, strg);

			ans = blank || multiple;
		} else {
			return false;
		}
		strg[str.length()][pattern.length()] = (ans ? 1 : -1);
		return ans;
	}

private static boolean wildcardBU(String str,String pattern) {      //bottom up
	boolean[][] strg=new boolean[str.length()+1][pattern.length()+1];
	strg[str.length()][pattern.length()]=true;
	for(int row=str.length();row>=0;row--) {
		for(int col=pattern.length()-1;col>=0;col--) {
			if(row==str.length()) {
				if(pattern.charAt(col)=='*') {
					strg[row][col]=strg[row][col+1];
				}else
					strg[row][col]=false;
				continue;
			}
			char chs=str.charAt(row);
			char pas=pattern.charAt(col);
			
			boolean ans;
			if(pas=='?' || chs==pas) {
				strg[row][col]=strg[row+1][col+1];
			}
			else if(pas=='*') {
				boolean left= strg[row][col+1];
				boolean bottom=strg[row+1][col];
				
				 ans=left|| bottom;
				 strg[row][col]=ans;
			}
			else {
				strg[row][col]=false;	
			}
		}	
	}
	return strg[0][0];
}

}
