package nadoslearning;

import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printIncreasing(num);
    }

    public static void printIncreasing(int n){
        if(n==0)
            return;
        
        printIncreasing(n-1);
        System.out.println(n);
    }

}
