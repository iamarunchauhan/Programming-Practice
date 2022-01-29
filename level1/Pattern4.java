package nadoslearning;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		
		int nsp = numCount - 1;
		int nst = 1;
		
		for(int i = 0; i < numCount; i++) {
			for(int j = 0; j < nsp; j++) {
				System.out.print("\t");
			}
			
			for(int k = 0; k < nst; k++) {
				System.out.print("*\t");
			}
			nsp--;
			nst++;
			System.out.println();
		}
	}
}
