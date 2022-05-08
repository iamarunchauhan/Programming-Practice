package strings;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] twoDArr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				twoDArr[i][j] = sc.nextInt();
			}
		}
		
		int sum1=0;
		int sum2=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					sum1 += twoDArr[i][j];
				}
				if(j==n-i-1) {
					sum2 += twoDArr[i][j];
				}
			}
		}
		
		System.out.println(sum2 - sum1);
		
		/* Another approaches */
		
//		for(int i=0,j=0; i<n && j<n; i++, j++) {
//			sum1 += twoDArr[i][j];
//		}
//		
//		for(int i=n-1,j=0; i<n && j<n; i--, j++) {
//			sum2 += twoDArr[i][j];
//		}
		
		int add = 0;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(i==j) {
//					sum1 = twoDArr[i][j];
//				}
//				if(j==n-i-1) {
//					sum2 = twoDArr[i][j];
//				}
//				
//			}
//			int a = sum2 - sum1;
//			System.out.println("a : " +a);
//			add = add + a;
//		}

	}
}


// "dee102pak971"

// "15903" - "15951"
// "49650871" - "49655871" - "49655694"
// "61940032" - "61944032" - "61944932" - "61944912" -"61944916"
// "1234" - "1334" -"1331"

//[1,2, 3] 
//[3,4, 5] - {[2,3], [2,5], [3,3], [3,5]}

// [1,2] 
// [1,2] 
// [1,2] 