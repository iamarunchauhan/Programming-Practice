/* https://leetcode.com/problems/find-the-winner-of-the-circular-game */

package recursion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WinnerOfCircularGame {

	public static int findTheWinner(int n, int k) {
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			q.offer(i);
		}
		
		while(q.size() !=1) {
			for(int i=0; i<k-1; i++) {
				q.offer(q.poll());
			}
			q.poll();
		}
		
		return q.peek();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(findTheWinner(n, k));
	}
}
