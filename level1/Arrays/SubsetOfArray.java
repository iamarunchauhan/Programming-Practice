package nadoslearning;

import java.util.Scanner;

public class SubsetOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] numArr = new int[num];
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		
		int length = (int) Math.pow(2, numArr.length);
		for(int i=0; i<length; i++) {
			String subSet = "";
			int tempVar = i;
			
			for(int j=numArr.length-1; j>=0; j--) {
				int rem = tempVar % 2;
				tempVar = tempVar / 2;
				
				if(rem == 0) {
					subSet = "-\t" + subSet;
				} else {
					subSet = numArr[j] + "\t" +  subSet;
				}
			}
			System.out.println(subSet);
		}
	}

}
