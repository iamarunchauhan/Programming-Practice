package nadoslearning;

import java.io.*;
import java.util.*;

public class String2 {

	public static String compression1(String str){
		String first = str.substring(0,1);

		for(int i=1; i<str.length(); i++){
			char currentChar = str.charAt(i);
			char previousChar = str.charAt(i-1);

			if(currentChar != previousChar){
				first += currentChar;
			}
		}

		return first;
	}

	public static String compression2(String str){
		String first = str.substring(0,1);
		int count = 1;

		for(int i=1; i<str.length(); i++){
			char currentChar = str.charAt(i);
			char previousChar = str.charAt(i-1);

			if(currentChar == previousChar){
				count++;
			} else {
				if(count > 1){
					first += count;
					count = 1;
				}
				first += currentChar;
			}
		}

		if(count > 1){
			first +=count;
			count = 1;
		}
		return first;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}