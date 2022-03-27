package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	 public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int tower1Id = sc.nextInt();
        int tower2Id = sc.nextInt();
        int tower3Id = sc.nextInt();

        toh(n, tower1Id, tower2Id, tower3Id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0)
            return;

        toh(n-1, t1id, t3id, t2id);
        System.out.println(n + "[" +t1id+" -> "+t2id+ "]");
        toh(n-1, t3id, t2id, t1id);   
    }

}
