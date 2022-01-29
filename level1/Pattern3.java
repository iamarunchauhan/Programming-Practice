package nadoslearning;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		
		/*
		for(int i = 0; i < numCount; i++) {
			for(int j = 0; j < numCount-i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		*/

		//Triangle Code
		for(int i = 0; i < numCount; i++) {
			for(int j = 0; j < numCount-i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		    * 
//		   * * 
//		  * * * 
//		 * * * *
//		* * * * * 
		   
	}
}
