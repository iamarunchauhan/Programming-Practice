package nadoslearning;

import java.util.Scanner;

	/* Example - ababc 
	
	 Substring length 1 - a, b, a, b, c
	 Substring length 2 - ab, ba, ab, bc - if equal
	 Substring length 3 - aba, bab, abc
	 Substring length 4 - abab, babc, bccb
	 Substring length 5 - ababc
	 
	 */

public class String1 {
	public static void solution(String str) {
		
		char strArray[] = str.toCharArray(); //Converted string into char Array
		for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++) {
				String newStr = "";
				for(int k = i; k <= j; k++) {
					newStr += strArray[k];
				}
				boolean flag = palindrome(newStr);
				if(flag == true) {
					System.out.println(newStr);
				}
				//System.out.println(newStr);
				//System.out.println();
			}
			System.out.println();
		}
	}
	
	public static boolean palindrome(String newStr) {
		int count = newStr.length();
		int i = 0;
		int j = count - 1;
		
		while(j >= i) {
			if(newStr.charAt(i) == newStr.charAt(j)) {
				
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		solution(str);
		
	}

}
