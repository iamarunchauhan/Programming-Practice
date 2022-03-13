package nadoslearning;

import java.util.Scanner;

public class SubArraysOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] numArr = new int[num];
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		
		for(int i=0; i < numArr.length; i++) {
			for(int j=i; j < numArr.length; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(numArr[k] +"\t");
				}
				System.out.println();
			}
		}

	}

}
