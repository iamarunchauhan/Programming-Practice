package nadoslearning;

import java.util.*;

public class SlopePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		
		/* Solution 1
		
		for(int i = 1; i<=numCount; i++) {
			for(int j = 0; j<i-1; j++) {
				System.out.print("\t");
			}
			System.out.print("*");
			System.out.println();
		}
		
		*/
		
		/*Solution 2 */
		
		for(int i = 1; i<=numCount; i++) {
			for(int j = 1; j<=numCount; j++) {
				if(i==j) {  //For Diagonal condition
					System.out.print("*");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
