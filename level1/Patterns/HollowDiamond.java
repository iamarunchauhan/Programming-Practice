package nadoslearning;

import java.util.*;

public class HollowDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount  = sc.nextInt();
		
		int numSt = (numCount/2) +1;
		int numSp = 1;
		
		for(int i=1; i<=numCount; i++) {
			for(int j=1 ; j<=numSt; j++) {
				System.out.print("*\t");
			}
			
			for(int j=1 ; j<=numSp; j++) {
				System.out.print("\t");
			}
			
			for(int j=1 ; j<=numSt; j++) {
				System.out.print("*\t");
			}
			
			if(i <= numCount/2) {
				numSt--;
				numSp += 2;
			} else {
				numSt ++;
				numSp -=2;
			}
			
			System.out.println();
		}
		
	}
}
