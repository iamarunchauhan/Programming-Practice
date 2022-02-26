package nadoslearning;
import java.util.*;

public class AnyBaseToDecimal{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int d = getValueIndecimal(n, b);
    System.out.println(d);
 }

 public static int getValueIndecimal(int n, int b){
    int totalSum = 0;

    int exp = 0;
    while(n > 0){
       int rem = n % 10;
       n = n/10;

       totalSum += rem * Math.pow(b, exp);
       exp++;
    }

    return totalSum;
 }
}