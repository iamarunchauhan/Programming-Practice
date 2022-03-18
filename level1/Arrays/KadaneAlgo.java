package nadoslearning;

import java.util.Scanner;

public class KadaneAlgo {

	public static int solution(int[] arr) {
		int currSum = arr[0];
		int overallSum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(currSum >=0) {
				currSum += arr[i];
			} else {
				currSum = arr[i];
			}
		}
		
		if(currSum > overallSum) {
			overallSum = currSum;
		}
		
		return overallSum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] numArr = new int[n];
		for(int i=0; i<n; i++) {
			numArr[i] = sc.nextInt();
		}
		
		System.out.println(solution(numArr));

	}

}
