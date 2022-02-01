package nadoslearning;

import java.io.*;
import java.util.*;

public class ToggleCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String newStr = str.toUpperCase();
		
		String finalStr = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == newStr.charAt(i)) {
				String temp = str.charAt(i) +"";
				finalStr += temp.toLowerCase();
			} else {
				String temp = str.charAt(i) +"";
				finalStr += temp.toUpperCase();
			}	
		}
		
		System.out.println(finalStr);
	}
}
