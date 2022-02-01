package nadoslearning;

import java.io.*;
import java.util.*;

public class DifferenceOfASCII {

	public static String solution(String str){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str.charAt(0));
		
		//For Ex - first character is appended otherwise same character is repeating
		
		for(int i = 1; i < str.length();i++) {
			char currentChar = str.charAt(i);
			char prevChar = str.charAt(i-1);
			
			int asciiVal = currentChar - prevChar;
			stringBuilder.append(asciiVal);
			stringBuilder.append(currentChar);
		}

		return stringBuilder.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}