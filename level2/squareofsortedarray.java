import java.util.*;
 
 public class Main {
 
     // This is a functional problem. You have to complete this function.
     // It takes as input an integer array. It should return
     // the required array.
     public static int[] sortedSquares(int[] A) {
         // write your code here. 
         //using two pointer approach
         int i=0;
         int j=A.length-1;
         int [] ans=new int [A.length];
         int c=A.length-1;
         while(c>=0){
             if(A[i]*A[i]>A[j]*A[j]){
                 ans[c]=Math.abs(A[i]*A[i]);
                 i++;
             }
             else{
                 ans[c]=Math.abs(A[j]*A[j]);
                 j--;
             }
             c--;
             
         }
         return ans;
         
 
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input for length of array.
         int length = sc.nextInt();
 
         int[] arr = new int[length];
 
         // Input for elements of array.
         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
         }
 
         int[] result = sortedSquares(arr);
         display(result);
 
     }
 
     // function to display an array.
     public static void display(int[] arr) {
 
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
 
         System.out.println();
     }
 
 }
