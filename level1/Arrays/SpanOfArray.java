package nadoslearning;

import java.util.*;

public class SpanOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();

	    int[] numArr = new int[num];
	    for(int i=0; i<num;i++){
	        numArr[i] = sc.nextInt();
	    }

	    int max = numArr[0];
	    int min = numArr[0];

	    for(int i=1; i<num; i++) {
	        if(max < numArr[i]){
	            max = numArr[i];
	        }

	        if(min > numArr[i]){
	            min = numArr[i];
	        }
	    }

	    System.out.println(max-min);

	}

}
