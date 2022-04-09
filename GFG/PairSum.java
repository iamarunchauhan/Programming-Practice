diff// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int len = arr.length;
        for(int i=0; i< len; i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], ++count);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        // Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
         
        // while(itr.hasNext())
        // {
        //      Map.Entry<Integer, Integer> entry = itr.next();
        //       System.out.println("Key = " + entry.getKey() +
        //                          ", Value = " + entry.getValue());
        // }
        
        // arr = 1,5,7,1
        // 1 => 1,
        // 5 => 0 ,
        // 7 => 1
        
        // // 1, 1, 1, 1
        
        // 1 => 1 , pair = 5
    
        // k = 9
        // // 4, 5, 5, 1, 1, 8, 0, 9
        // 4 = 0
        // 5 = 0
        // 1 = 0
        // 8 = 0
        // 0 = 0
        // 9 = 0
        
        // pair = 5
        
        // // 4, 4 , 4  k =8

        // 4 = 0
        
        // pair = 3
        
        int pair = 0;
        
        for(int i=0; i<len; i++){
            int val = map.get(arr[i]) - 1;
            map.put(arr[i], val);
            
            int diff = k - arr[i];
            //System.out.println("Difference : " + diff);
            
            if(map.containsKey(diff)){
                int countVal = map.get(diff);
                pair += countVal ;
                //System.out.println("Pair" + pair);
            }
        }
        
        return pair;
    }
    
}
