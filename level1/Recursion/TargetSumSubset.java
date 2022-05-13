package recursion;

import java.io.*;
import java.util.*;

public class TargetSumSubset {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] numArr = new int[num];
        for(int i=0; i<numArr.length; i++){
            numArr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        printTargetSumSubsets(numArr, 0, "", 0, tar);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        
        if(sos> tar){
            return;
        }

        if(idx == arr.length){

            if(sos == tar){
                System.out.println(set+".");
            }
            return;
            
        }

        printTargetSumSubsets(arr, idx+1, set + arr[idx] + ", ", sos+arr[idx], tar);
        printTargetSumSubsets(arr, idx+1, set, sos, tar);
        
    }

}

// n - 5
// [1,2,3,4,5]

// tar = 10

// [1,4,5], [2,3,5], [1,2,3,4]
