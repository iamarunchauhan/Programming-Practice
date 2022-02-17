package nadoslearning;

import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int num, int digit) {
        
        int freq = 0;

        while(num > 0){
            int quotient = num / 10;
            int remainder = num % 10;

            if(remainder == digit) freq++;
            num = quotient;
        }

        return freq;
    }
}