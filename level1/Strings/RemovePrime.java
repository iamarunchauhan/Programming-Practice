package nadoslearning;

import java.util.*;

public class RemovePrime {

	public static boolean numIsPrime(int val ) {
		
		/* For prime condition like number is 7
		 Starting with 2, then i = 2, i = 4 <=7; i++ - True 
		 Then with 3, then i=3, 9<=7, i++ - False condition so it'll not go inside loop
		 */
		
		for(int i=2; i*i<= val; i++) {
			if(val % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void solution(ArrayList<Integer> arrList) {
		
		/* Starting loop in reverse direction to keep the correct track of number
		 In case any number is prime & got removed from the list
		 */

		for(int i=arrList.size()-1; i>=0; i--) {
			int val = arrList.get(i);
			
			if(numIsPrime(val) == true) {
				arrList.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount  = sc.nextInt();
		
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i=0; i<numCount; i++) {
			arrList.add(sc.nextInt());
		}
		
		solution(arrList);
		System.out.println(arrList);
		
	}

}
