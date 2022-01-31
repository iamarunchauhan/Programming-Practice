package nadoslearning;

import java.util.Scanner;

public class Pattern4dot1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =  sc.nextInt();
		
		/*
		0 5 - Flow of space & star
		1 4
		2 3
		3 2
		4 1 */
		
		int nsp = 1;
		int nst = count - 1;
		
		for(int i = 0; i < count; i++) {
			for(int j = 1; j < nsp; j++) {
				System.out.print("\t");
			} 
			
			for(int k = 0; k < nst+1 ; k++) {
				System.out.print("*\t");
			}
			
			nsp++;
			nst--;
			
			System.out.println();
		}
	}
}
