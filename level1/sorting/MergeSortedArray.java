package sorting;

import java.io.*;
import java.util.*;

// [1,3,5,7]
// [2,4,6,8,10]

public class MergeSortedArray {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int[] mergeArr = new int[a.length + b.length];

    int i =0;
    int j =0;
    int k =0;

    while(i<a.length && j < b.length){

      if(a[i] < b[j]){
        mergeArr[k] = a[i];
        i++;
        k++;
      } else {
        mergeArr[k] = b[j];
        j++;
        k++;
      }
      
    }

    while (i <a.length){
      mergeArr[k] = a[i];
        i++;
        k++;
    }

    while (j <b.length){
      mergeArr[k] = b[j];
        j++;
        k++;
    }

    return mergeArr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}