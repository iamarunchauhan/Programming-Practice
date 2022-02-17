package nadoslearning;

import java.io.*;
import java.util.*;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		int[][] arrElem1 = new int[r1][c1];
		
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				arrElem1[i][j] = sc.nextInt();
			}
		}
		
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		int[][] arrElem2 = new int[r2][c2];
		
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				arrElem2[i][j] = sc.nextInt();
			}
		}

		if(c1 !=r2) {
			System.out.println("Invalid input");
			return;
		}
		
		int[][] arrRes = new int[r1][c2];
		for(int i = 0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				for(int k=0; k < c1; k++) {
					arrRes[i][j] += arrElem1[i][k] * arrElem2[k][j];
				}
			}
		}
		
		for(int i = 0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				System.out.print(arrRes[i][j] +" ");
			}
			System.out.println();
		}
	}
}
