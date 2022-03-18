package nadoslearning;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] numArr= new int[num];
		for(int i=0; i<num; i++)
			numArr[i] = sc.nextInt();
		
		int k = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0;i<num;i++)
			pq.add(numArr[i]);
		
		for(int i=0;i<k-1;i++)
		    pq.poll();
		    
		System.out.println(pq.peek());
	}
	
	// 51, 52, 53, 54, 55, 56, 57
}
