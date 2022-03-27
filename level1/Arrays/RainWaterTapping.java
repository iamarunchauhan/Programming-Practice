package nadoslearning;

import java.io.*;
import java.util.*;
import java.lang.*;

class RainWaterTapping {

	public static void main (String[] args) throws IOException {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] numArr= new int[num];
		for(int i=0; i<num; i++)
			numArr[i] = sc.nextInt();
	    
	    Solution obj = new Solution();
	    System.out.println(obj.trappingWater(numArr, num));
	}
}

class Solution{

	 static long trappingWater(int arr[], int n) { 
	     int[] leftArr = new int[n];
	     int[] rightArr = new int[n];
	     
	     //0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 - arr
	     //0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3 - left arr
	     //3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1 - right arr
	     
	     leftArr[0] = arr[0];
	     for(int i=1; i<n; i++){
	         leftArr[i] = Math.max(leftArr[i-1], arr[i]);
	     }
	     
	     rightArr[n-1] = arr[n-1];
	     for(int i=n-2; i >= 0; i--){
	         rightArr[i] = Math.max(rightArr[i+1], arr[i]);
	     }
	     
	     // 0 + 0 + 1 + 0 + 1 + 2 + 1 + 0 + 0 + 1 + 0 + 0
	     long sum = 0;
	     for(int i=0; i<n; i++){
	         sum = sum + (Math.min(leftArr[i], rightArr[i]) - arr[i]); 
	     }
	     return sum;
	 } 
}



