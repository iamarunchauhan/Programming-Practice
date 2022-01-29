package nadoslearning;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
		
        //Reverse Order
        
        /*
        
        *****
        ****
        ***
        **
        *
        
        */
       
		for(int i = 1 ; i <= count; i++){
            for (int j = count; j >= i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}
}
