package recursion;
import java.util.*;

public class PrintArray {

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] numArr = new int[n];
        for(int i=0; i<n; i++)
            numArr[i] = sc.nextInt();
        
        displayArr(numArr, 0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length)
            return;

        System.out.println(arr[idx]);
        displayArr(arr, idx+1);
    }
}
