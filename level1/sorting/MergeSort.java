package sorting;

import java.io.*;
import java.util.*;

/* Example - This arrays need to be sorte using Merge Sort [3,4,1,7,6,2]
 * Break it into 2 parts - [3,4,1] and [7,6,2] 
 * Break it until low and high are equal - [3,4], [1] and [7,6], [2] 
 * [3], [4], [1] and [7], [6], [2] 
 * Now start merging sorted arrays 
 * Sorted -> [3,4], [1] and [6,7], [2] 
 * [1,3,4] and [2,6,7]
 * Final sorted arr = [1,2,3,4,6,7] */

public class MergeSort {

  public static int[] mergeSort(int[] arr, int lo, int hi) {

    if(lo==hi){
      int[] a = new int[1];
      a[0] = arr[lo];
      return a;
    }

    int mid = (lo + hi)/2;

    int [] firstSortedhalf = mergeSort(arr, lo, mid);
    int [] secondSortedhalf = mergeSort(arr, mid+1, hi);
    int [] fullSortedArr = mergeTwoSortedArrays(firstSortedhalf, secondSortedhalf);
  
    return fullSortedArr;
  }

  //used for merging two sorted arrays
  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    System.out.println("Merging these two arrays ");
    System.out.print("left array -> ");
    print(a);
    System.out.print("right array -> ");
    print(b);
    int i = 0, j = 0, k = 0;
    int[] ans = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] <= b[j]){
          ans[k] = a[i];
          i++;
          k++;
        }else{
          ans[k] = b[j];
          j++;
          k++;
        }
    }

    while(i < a.length){
      ans[k] = a[i];
      k++;
      i++;
    }

    while(j < b.length){
      ans[k] = b[j];
      k++;
      j++;
    }
    
    return ans;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int[] sa = mergeSort(arr,0,arr.length - 1);
    System.out.print("Sorted Array -> ");
    print(sa);
  }

}