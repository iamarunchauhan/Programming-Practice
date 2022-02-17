package nadoslearning;

import java.util.*;

public class PermutationOfString {

	public static void solution(String str){
		int len = str.length();
		int fact = factorial(len);
	
		for(int i=0; i<fact; i++) {
			StringBuilder sb = new StringBuilder(str);
			int tempVar = i;
			for(int div = len; div >=1; div--) {
				int q = tempVar / div;
				int r = tempVar % div;
				
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				
				tempVar = q;
			}
			System.out.println();
		}
	}
	
	public static int factorial(int n) {
		int res = 1;
		for(int i=2; i<=n; i++) {
			res *=i ;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
