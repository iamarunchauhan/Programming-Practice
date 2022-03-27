package recursion;
import java.util.*;

public class MaxOfArray {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] numArr = new int[n];
        for(int i=0; i<n; i++)
            numArr[i] = sc.nextInt();
        
        System.out.println(maxOfArray(numArr, 0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1)
            return arr[idx];

        int misa = maxOfArray(arr, idx+1);
        if(misa > arr[idx])
            return misa;
        else 
            return arr[idx];
        
    }

}
