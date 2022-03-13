package strings;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rotStr = sc.next();
		String str = sc.next();
		
		/* KMP Algorithm using for Pattern searching */
		/* Another approach is do rotation 
		 Ex :  Do x left rotation & check if equals. x left roation = (n-x) Right rotation
		 * */
		
		String newStr = str + str;
		
		if(newStr.contains(rotStr)) {
			System.out.println(str +" is a rotation of "+ newStr);
		} else {
			System.out.println(str +" is not a rotation of "+ newStr);
		}
	}

}
