package nadoslearning;

import java.util.Scanner;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int num = sc.nextInt();

	    int[] numArr = new int[num];
	    for(int i=0; i<num; i++) {
	        numArr[i] = sc.nextInt();
	    } 

	    int d =  sc.nextInt();

	    int l = 0;
	    int h = numArr.length - 1;
	    int firstIndex = -1;

	    while(l<=h) {
	        int mid = (l + h) / 2;
	        if(d > numArr[mid]){
	            l = mid + 1;
	        } else if (d < numArr[mid]){
	            h = mid - 1;
	        } else {
	            firstIndex = mid;
	            h = mid - 1;
	        }
	    } 

	    System.out.println(firstIndex);

	    l = 0;
	    h = numArr.length - 1;
	    int lastIndex = -1;

	    while(l<=h) {
	        int mid = (l + h) / 2;
	        if(d > numArr[mid]){
	            l = mid + 1;
	        } else if (d < numArr[mid]){
	            h = mid - 1;
	        } else {
	            lastIndex = mid;
	            l = mid + 1;
	        }
	    } 

	    System.out.println(lastIndex);
	}
}
