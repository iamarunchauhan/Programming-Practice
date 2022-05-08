package nadoslearning;

import java.util.Scanner;

public class NextPalindrome {

	public static void findPalindrome(int n) {
		int sum = 0;
		int rem = 0;
		int temp = 0;
		
		while(true) {
			n++;
			temp = n;
			sum = rem = 0;
			
			while(temp > 0) {
				rem = temp % 10;
				sum = sum * 10 + rem;
				temp = temp / 10;
			}
			
			if(sum == n){
				System.out.println("Next Palindrome : " +n);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		findPalindrome(num);
	}

}
