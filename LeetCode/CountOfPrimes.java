// https://leetcode.com/problems/count-primes/ 

class Solution {
    public int countPrimes(int n) {
        
        int count = 0;
        boolean[] arr = new boolean[n+1];
        
        for(int i=2; i*i <= n; i++){
            if(arr[i] == false) {
                for(int j=2; i*j <= n; j++){
                    arr[i*j] = true;
                }
            }  
        }
        
        for(int i=2; i < n; i++){
            if(arr[i] == false){
                count++;
            }
        }
       
        return count;
    }
}


