package recursion;

import java.util.Scanner;

public class PowerLogarithmic {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int pow = power(x, n);
        System.out.println(pow);
    }

    public static int power(int x, int n) { 
    	if(n==0)
    		return 1;
    	int pow = power(x, n/2) * power(x, n/2);
    	if(n%2 == 1)
    		pow = pow * x;
    	return pow;
    }

}
