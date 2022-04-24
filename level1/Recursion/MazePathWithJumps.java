package recursion;

import java.io.*;
import java.util.*;

public class MazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(getMazePaths(1,1, n, m));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> basePath = new ArrayList<String>();
            basePath.add("");
            return basePath;
        }

        ArrayList<String> paths = new ArrayList<String>();

        //horizontal move
        for(int move=1; move <= dc-sc; move++ ){
            ArrayList<String> hpaths = getMazePaths(sr, sc+move, dr, dc);
            for(String path : hpaths){
                paths.add("h" + move + path);
            }
        }

        //vertical move
        for(int move=1; move <= dr-sr; move++ ){
            ArrayList<String> vpaths = getMazePaths(sr+move, sc, dr, dc);
            for(String path : vpaths){
                paths.add("v" + move + path);
            }
        }

        //diagonal move
        for(int move=1; move <= dr-sr && move <= dc-sc ; move++ ){
            ArrayList<String> dpaths = getMazePaths(sr+move, sc+move, dr, dc);
            for(String path : dpaths){
                paths.add("d" + move + path);
            }
        }

        return paths;
        
    }
}


