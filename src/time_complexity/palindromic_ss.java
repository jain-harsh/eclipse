package time_complexity;

public class palindromic_ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paindromic("nitin");
	}

	public static void paindromic(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			for (int orbit = 0; orbit+i > 0 && orbit +i< str.length(); orbit++) {
				if (str.charAt(i - orbit) == str.charAt(i + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}
		for (double i = 0.5; i < str.length(); i++) {
			for (double orbit = 0.5; orbit+i > 0 && orbit+i< str.length(); orbit++) {
				if (str.charAt((int) (i - orbit)) == str.charAt((int) (i + orbit))) {
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}
