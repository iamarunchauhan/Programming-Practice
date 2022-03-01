package nadoslearning;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateAnArray {

	public static void display(int[] a){
		StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	 }

	public static void reverse(int[] a, int i, int j) {
		int ith = i;
		int jth = j;
		
		while(ith < jth) {
			int temp = a[ith];
			a[ith] = a[jth];
			a[jth] = temp;
			
			ith++;
			jth--;
		}
	}
	
	public static void rotate(int[] a, int k){
		//Because after a particular rotation array will be back to original form
		k = k % a.length; 
		if(k < 0) {
			k = k + a.length;
		}
	   
		/* For Ex - a b c d e f g | h i j
		 In above case we will take part 2 from i if k = 3
		 **/
		
		//Reversing part 1st
		reverse(a, 0, a.length-k-1);
		
		//Reversing part 2nd 
		reverse(a, a.length-k, a.length-1);
		
		//Reversing complete array
		reverse(a, 0, a.length-1);
		
	}
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    rotate(a, k);
	    display(a);
	 }
}