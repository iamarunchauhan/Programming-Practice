package nadoslearning;

import java.util.*;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		int[] arr1 = new int[n1];
	    for(int i=0; i<n1;i++){
	        arr1[i] = sc.nextInt();
	    }
	    
	    int n2 = sc.nextInt();
		
		int[] arr2 = new int[n2];
	    for(int i=0; i<n2;i++){
	        arr2[i] = sc.nextInt();
	    }
	    
	    int[] sumArr = new int[n1 > n2 ? n1: n2]; //Bringing max out of both size
	    int carry = 0;
	    
	    /*
			Adding 9999 with 1, it will result in 10000 and 1 will be carry
			So that 1 we're prepending if greater than 0
	    */
	    
	    int i = arr1.length - 1;
	    int j = arr2.length - 1;
	    int k = sumArr.length - 1;
	    
	    while(k >= 0) {
	    	int d = carry;
	    	
	    	if(i >= 0) {
	    		d += arr1[i];
	    	}
	    	
	    	if(j >= 0) {
	    		d += arr2[j];
	    	}
	    	
	    	carry = d / 10; // Getting out carry from number
	    	d = d % 10;	//Remainder that's one's place value
	    	
	    	sumArr[k] = d;
	    	
	    	i--;
	    	j--;
	    	k--;
	    }
	    
	    if(carry!=0) {
	    	System.out.println(carry);
	    }
	    
	    for (int val : sumArr) {
	    	System.out.println(val);
	    }
	}
}
