package nadoslearning;

import java.util.*;

public class AcceleratePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		
		for(int i=1; i<=numCount; i++) {
			for(int j=1; j<=numCount; j++) {
				if(i+j == numCount+1) { //Pattern when count + 1 equals to i&j sum
					System.out.print("*");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
