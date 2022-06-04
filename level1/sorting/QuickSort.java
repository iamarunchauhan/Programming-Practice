package sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static void quickSort(int[] arr, int lo, int hi) {
		
		if(lo >= hi) {
			return;
		}
		
		int pivot = arr[hi];
		int pivotIndex = partition(arr, pivot, lo, hi);
		
		quickSort(arr, lo, pivotIndex-1);
		quickSort(arr, pivotIndex+1, hi);
		
	}
	
	public static int partition(int[] arr, int pivot, int lo, int hi) {
		int i = lo, j = lo;
		while(i <arr.length) {
			if(arr[i]> pivot) {
				i++;
			} else {
				swap(arr, i, j);
				i++;
				j++;
			}
		}
		
		return j-1;
	}
	
	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr, 0, arr.length-1);
		printArr(arr);

	}
}
