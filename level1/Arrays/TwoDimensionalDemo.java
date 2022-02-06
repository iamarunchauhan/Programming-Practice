package nadoslearning;

import java.io.*;
import java.util.*;

public class TwoDimensionalDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int numRow = sc.nextInt();
	    int numCol = sc.nextInt();

	    int[][] arrElem = new int[numRow][numCol];
	    
	    for(int i=0; i<numRow; i++) {
	    	for(int j=0; j<numCol; j++) {
	    		arrElem[i][j] = sc.nextInt();
	    	}
	    }
	    
	    for(int i=0; i<numRow; i++) {
	    	for(int j=0; j<numCol; j++) {
	    		System.out.print(arrElem[i][j] +" ");
	    	}
	    	System.out.println();
	    }
	}
}
