package nadoslearning;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        
        for(int i = 1 ; i <= count; i++){
            for (int j = 1; j < i+1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}
}
