package sorting;

import java.io.*;
import java.util.*;

// Arr = [7,5,3,2,6,1,9,] and pivot = 4
// ResutArr = [1,2,3,5,6,7,9]

/*
Solving this problem with concept of regions - Unknown region, greater than & less than
0 to end -> unknown region
j to i-1 -> Greater that region
0 to j-1 -> Less than equals region
*/

public class PartitionOfArray {

  public static void partition(int[] arr, int pivot){
    int i=0,j=0;
    while(i<arr.length){
      if(arr[i]> pivot){
        i++;
      } else {
        swap(arr, i, j);
        i++;
        j++;
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
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
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}
