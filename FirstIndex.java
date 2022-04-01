package recursion;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numArr = new int[n];
        for(int i=0; i<n; i++) {
            numArr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        System.out.println(firstIndex(numArr, 0, x));

    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length-1){
            return -1;
        }

        if(arr[idx] == x) {
            return idx;
        } else {
            int firstOcc = firstIndex(arr, idx+1, x);
            return firstOcc;
        }
    }

} 