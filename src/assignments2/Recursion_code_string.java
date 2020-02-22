package assignments2;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_code_string {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(code(str));
	}

	public static ArrayList<String> code(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch=string(str.charAt(0));
		String roq=str.substring(1);

		ArrayList<String> rr = code(roq);

		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
//			mr.add(val+96); // no
			mr.add(ch+96 + val); // yes
		}
		return mr;
	}
	public static char string(char ch) {
		int ans=ch+96;
		return (char)ans;
	}
	
	//EDITORIAL UNLOCKED
//	public static ArrayList CodeofString(String str){
//
//        //Base Case
//     if(str.length() <= 0){
//         ArrayList br = new ArrayList<>();
//         br.add("");
//         return br;
//     }
//	
//     char ch = str.charAt(0);
//     String ros = str.substring(1);
//       //Smaller Problem 1
//     ArrayList rr1 = CodeofString(ros);
//     ArrayList mr = new ArrayList<>();
//
//        // Self Work 1
//     char cvrt_ch = (char)(ch + 48);
//
//     for(String val:rr1){
//         mr.add(cvrt_ch + val);
//     }
//
//     if(str.length() >= 2){  //Need not to work for String smaller than 2
//               //Smaller Problem 2
//       String ch2 = str.substring(0,2);
//       String ros2 = str.substring(2);
//
//              //The number must be smaller than 2 like 36 is not valid number
//       if(Integer.parseInt(ch2) <= 26){
//           char cvrt_ch2 = (char)(Integer.parseInt(ch2) + 'a' - 1);
//           ArrayList rr2 = CodeofString(ros2);
//                    // Self Work 2
//           for(String val:rr2){
//               mr.add(cvrt_ch2 + val);
//           }
//     }
//   }    
//     return mr;
//
// }
}



