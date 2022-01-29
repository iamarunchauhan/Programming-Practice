import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int mostWater(int[] heights) {
        // write your code here
        int i=0;
        int j=heights.length-1;
        int max=0;
        while(i<j){
            int area=(j-i)*Math.min(heights[i],heights[j]);
            max=Math.max(area,max);
            if(heights[j]>heights[i]){
                i++;
            }
            else{
               j--;
            }
        }
        return max;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = scn.nextInt();
        }

        int res = mostWater(heights);
        System.out.println(res);
    }
}
