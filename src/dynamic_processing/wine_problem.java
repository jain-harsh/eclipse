package dynamic_processing;

public class wine_problem {
	public static void main(String[] args) {
		int[] wine= {2,3,5,1,4};
		System.out.println(wineprblm(wine, 0, wine.length-1, 1));
		System.out.println(wineprblmTD(wine, 0, wine.length-1, new int[wine.length][wine.length]));
		System.out.println(wineprblmBD(wine));
		
	}

	public static int wineprblm(int[]arr,int si,int ei,int yr) {
		if(si==ei) {
			return arr[si]*yr;
		}
		
		
		int start=wineprblm(arr, si+1, ei, yr+1)+arr[si]*yr;
		int end=wineprblm(arr, si, ei-1, yr+1)+arr[ei]*yr;
		
		return Math.max(start, end);
		
	}
	
	public static int wineprblmTD(int[]arr,int si,int ei,int [][]strg) {
		int yr=arr.length-ei+si;
		if(si==ei) {
			return arr[si]*yr;
		}
		if(strg[si][ei]!=0) {
			return strg[si][ei];
		}
		
		int start=wineprblmTD(arr, si+1, ei, strg)+arr[si]*yr;
		int end=wineprblmTD(arr, si, ei-1, strg)+arr[ei]*yr;
		int val= Math.max(start, end);
		strg[si][ei]=val;
		
		return val;
	}
	public static int wineprblmBD(int[]arr) {
		int[][]strg=new int[arr.length][arr.length];
		int n=arr.length;
		
		for(int slide=0;slide<n;slide++) {
			for(int si=0;si<=n-slide-1;si++) {
				int ei=si+slide;
				int yr=arr.length-ei+si;
				if(si==ei) {
					strg[si][ei]=arr[si]*n;
					continue;
				}
				
				int start=strg[si+1][ei]+arr[si]*yr;
				int end=strg[si][ei-1]+arr[ei]*yr;
				int val= Math.max(start, end);
				strg[si][ei]=val;
			}
		}
		return strg[0][n-1];
		
	}
}
