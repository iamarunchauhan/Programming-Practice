import java.util.*;
  
  public class Main {
  	  public static void main(String[] args) {
  	  	  Scanner scn = new Scanner(System.in);
  	  	  int r = scn.nextInt();
  	  	  int c = scn.nextInt();
  	  	  int[][] Input = new int[r][c];
  	  	  for (int i = 0; i < r; i++) {
  	  	  	  for (int j = 0; j < c; j++) {
  	  	  	  	  Input[i][j] = scn.nextInt();
  	  	  	  }
  	  	  }
  	  	  System.out.print(numMagicSquaresInside(Input));
  	  }
  
  	  // -----------------------------------------------------
  	  // This is a functional problem. Do not make changes to main
  	  // This function takes as input an array and integer k.
  	  // It should print required output.
  	  public static boolean checkmagicgrid(int [][]grid,int row,int col){
  	      
  	      //rows
          //int flag=0;
         int c=0;
  	      int []rowsum=new int[3];
  	      for(int i=row;i<row+3;i++){
  	          for(int j=col;j<col+3;j++){
      	        rowsum[c]+=grid[i][j];
      	        
  	          }
  	          c++;
  	      }
  	      if(rowsum[0]==rowsum[1]&&rowsum[1]==rowsum[2]){
  	          c=0;
  	      }
  	      else{
  	          return false;
  	      }
  	      
  	      //columns
  	      int []colsum=new int[3];
  	      for(int i=col;i<col+3;i++){
  	          for(int j=row;j<row+3;j++){
      	        colsum[c]+=grid[j][i];
      	        
  	          }
  	          c++;
  	      }
  	      if(colsum[0]==colsum[1]&&colsum[1]==colsum[2]){
  	          c=0;
  	      }
  	      else{
  	          return false;
  	      }
  	      //diagonals
  	      int d1=0;
  	      for(int i=row,j=col;i<row+3&&j<col+3;i++,j++){
  	          d1+=grid[i][j];
  	      }
  	      int d2=0;
  	      for(int i=row+2,j=col+2;i>=row&&j>=col;i--,j--){
  	          d2+=grid[i][j];
  	      }
  	      if(d1==d2)
  	      {
  	          return true;
  	      }
  	      else{
  	          return false;
  	      }
  	  }
  	  
  	  public static int numMagicSquaresInside(int[][] grid) {
  	  	  // Write your code here
  	  	  int n1=grid.length;
  	  	  int n2=grid[0].length;
  	  	  if(n1<3||n2<3){
  	  	      return 0;
  	  	  }
  	  	  int count=0;
  	  	  for(int i=0;i<n1-3+1;i++){
  	  	      for(int j=0;j<n2+1-3;j++){
  	  	          if(grid[i+1][j+1]==5){
  	  	              boolean b=checkmagicgrid(grid,i,j);
  	  	              if(b==true)
  	  	              {
  	  	                  count++;
  	  	              }
  	  	          }
  	  	      }
  	  	  }
  	  
  	      return count;
  	  }
  }
