package recursion;

import java.io.*;
import java.util.*;

public class StairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arrList = getStairPaths(n);
        System.out.println(arrList);
    }

    public static ArrayList<String> getStairPaths(int n) { 

        ArrayList<String> resultList = new ArrayList<String>();

        if(n==0){
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        } else if (n < 0){
            ArrayList<String> list = new ArrayList<String>();
            return list;
        }

        ArrayList<String> way1 = getStairPaths(n-1); //[]
        ArrayList<String> way2 = getStairPaths(n-2);
        ArrayList<String> way3 = getStairPaths(n-3);
        
        for(int i=0; i<way1.size(); i++){ 
            resultList.add("1" + way1.get(i)); // ["1111"]
        }

        for(int i=0; i<way2.size(); i++){
            resultList.add("2" + way2.get(i)); // ["1111"]
        }

        for(int i=0; i<way3.size(); i++){
            resultList.add("3" + way3.get(i)); // ["1111"]
        }

        return resultList;
    }

}

