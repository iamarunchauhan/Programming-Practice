package nadoslearning;

import java.util.Scanner;
		
/*
	 *
	* *
   * * *
  * * * *
 * * * * *
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/

public class Pattern5 {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int count = sc.nextInt();
		
		int nsp = count/2;
		int nst = 1;
		
		for (int i = 1; i <= count; i++) {
			for(int j = 1; j <= nsp; j++) {
				System.out.print("\t");
			}
			
			for(int k = 1; k <= nst; k++) {
				System.out.print("*\t");
			}
			
			if(i <= count/2) {
				nsp--;
				nst +=2;
			} else {
				nst -=2;
				nsp++;
			}
			System.out.println();
		}
	}
}
