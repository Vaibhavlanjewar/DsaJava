/* 
3   -> Value of R(row) 
3    -> value of C(column) 
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line. 
Output : 
3  -> Row 3 has maximum number of 1’s
 */ 

import java.util.*;

public class maxConsecutive{
  public static int res(int arr[][],int row,int col){
   int maxi=0; 
   int cnt=0;

   for(int i=0;i<row;i++){
     for(int j=0;j<col;j++){
      if(arr[i][j]==1){
      maxi=Math.max(maxi,i);
      }
    }
  }
 return maxi+1;
  
  }
 
  public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   int row=sc.nextInt();
   int col=sc.nextInt();
   int arr[][]=new int[row][col];

   for(int i=0;i<row;i++){
     for(int j=0;j<col;j++){
     arr[i][j]=sc.nextInt();
    }
  }
 
   
   System.out.println(res(arr,row,col));
  }
}
