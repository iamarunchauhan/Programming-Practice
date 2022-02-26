package nadoslearning;

import java.util.*;
  
public class DecimalToAnyBase{
  
	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  int n = scn.nextInt();
	  int b = scn.nextInt();
	  int dn = getValueInBase(n, b);
	  System.out.println(dn);
	}
  
   public static int getValueInBase(int n, int b){
       int sum = 0;
       
       int count = 1;
       while (n > 0) {
    	   int r = n % b;
    	   n = n/b;
    	   
    	   sum += r*count;
    	   count = count * 10;
       }
       
       return sum;
   }
}