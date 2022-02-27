package nadoslearning;

import java.util.*;

public class BarChart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    int[] numArr = new int[num];
	    for(int i=0; i<num;i++){
	        numArr[i] = sc.nextInt();
	    }

	    int max = numArr[0];

	    for(int i=1; i<num; i++) {
	        if(max < numArr[i]){
	            max = numArr[i];
	        }
	    }
	    
	    for(int floor=max; floor>=1; floor--) {
	    	for(int i=0; i<num; i++) {
	    		if(numArr[i] >= floor) {
	    			System.out.print("*\t");
	    		} else {
	    			System.out.print("\t");
	    		}
	    	}
	    	System.out.println();
	    }
	}

}
