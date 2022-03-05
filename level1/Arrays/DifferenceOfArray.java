package nadoslearning;

import java.io.*;
import java.util.*;

public class DifferenceOfArray{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();

    int[] a1 = new int[n1];
    for(int i=0; i<n1; i++){
        a1[i] = sc.nextInt();
    }

    int n2 = sc.nextInt();
    int[] a2 = new int[n2];
    for(int i=0; i<n2; i++){
        a2[i] = sc.nextInt();
    }

    int[] diff = new int[n2];
    int borrow = 0;

    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;

    while (k >= 0){
        int d = 0;

        //If incase the array looped over length & doesn't have any element. 
        //So we'll take 0
        int a1Val = i >=0 ? a1[i] : 0;

        if(a2[j] + borrow >= a1Val){
            d = a2[j] + borrow - a1Val;
            borrow = 0;
        } else {
            d = a2[j] + borrow + 10 - a1Val;
            borrow = -1;
        }

        diff[k] = d;

        i--;
        j--;
        k--;
    }

    int pointer = 0;
    while(pointer < diff.length){
        if(diff[pointer] == 0){
            pointer++;
        } else {
            break;
        }
    }

    while(pointer < diff.length){
        System.out.println(diff[pointer]);
        pointer++;
    }

 }
}

 