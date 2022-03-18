package nadoslearning;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestInArray {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] numArr= new int[num];
		for(int i=0; i<num; i++)
			numArr[i] = sc.nextInt();
		
		int k = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<numArr.length; i++) {
			if(i < k) {
				pq.add(numArr[i]);
			} else {
				/* Priority Queue used MinHeap */
				if(numArr[i] > pq.peek()) {
					pq.remove();
					pq.add(numArr[i]);
				} 
			}
		}
		
		System.out.println(pq.peek());
	}
}
