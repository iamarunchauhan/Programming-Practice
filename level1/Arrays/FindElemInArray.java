package nadoslearning;

import java.io.*;
import java.util.*;

public class FindElemInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    int[] numArr = new int[num];
	    for(int i=0; i<num;i++){
	        numArr[i] = sc.nextInt();
	    }

	    int index = -1;
	     
	    int elem = sc.nextInt();
	    for(int i=0; i<num; i++){
	        if(numArr[i] == elem){
	            index = i;
	        }
	    }

	    if(index == -1){
	        System.out.println(index);
	    } else {
	        System.out.println(index);
	    }

	}

}
