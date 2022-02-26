package nadoslearning;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] numArr = {10, 24, 37, 43, 55, 69, 71, 96};
		//Sorting the array is also required in Binary Search
	
		int len = numArr.length;
		
		int elem = 55;
		
		int low = 0;
		int high = len - 1;
		
		int index = -1;
		
		while(high >= low) {
			int mid = (low + high) / 2;
			if(numArr[mid] == elem) {
				index = mid;
				break;
			} else if(numArr[mid] < elem) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		if(index == -1) {
			System.out.println("Element doesn't exist in the given array");
		} else {
			index = index + 1;
			System.out.println("Element present at this position : " +index);
		}
	}

}
