/* A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  
empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. 
The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking 
spaces full(1). 
 
Note : 
RxC- Size of the matrix 
Elements of the matrix M should be only 0 or 1. 
 
Example 1: 
Input : 
3   -> Value of R(row) 
3    -> value of C(column) 
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line. 
Output : 
3  -> Row 3 has maximum number of 1’s 
 
Example 2: 
input : 
4 -> Value of R(row) 
3 -> Value of C(column) 
[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C] 
Output : 
4  -> Row 4 has maximum number of 1’s*/ 
// https://prepinsta.com/tcs-coding-questions/*


import java.util.*;
 public class ParkingLot{

  public static int maxConsecutive1Row(int park[][],int r,int c)
  {
  
   int row=0;
   int mxCnt=Integer.MIN_VALUE;
    for(int i=0;i<r;i++)
    {
      int cnt=0;
     for(int j=0;j<c;j++)
      {
        if(park[i][j]==1){
          cnt++;
        }
        else cnt=0;
       mxCnt=Math.max(mxCnt,cnt);
      }
      if(mxCnt>=cnt)
      {
       mxCnt=cnt;
       row=i;
      }
    }
    return row+1;

  }
 
  public static void main(String args[])
  {

  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt();
  int c=sc.nextInt();
  int park[][]=new int[r][c];

    for(int i=0;i<r;i++)
    {
       for(int j=0;i<c;i++)
       {
        park[i][j]=sc.nextInt();
       }
    }

   System.out.print(maxConsecutive1Row(park,r,c));

  }  
/*
   Scanner sc=new Scanner(System.in); 
        int row=sc.nextInt(); 
        int col=sc.nextInt(); 
         
        int[][]arr=new int[row][col]; 
        int max=0; 
        for(int i=0;i<row;i++){ 
            for(int j=0;j<col;j++){ 
             arr[i][j]=sc.nextInt(); 
  
               }  
            } 
 
        for(int i=0;i<row;i++){ 
          for(int j=0;j<col;j++){ 
            if(arr[i][j]==1){ 
                max=Math.max(max,i); 
                } 
             }  
          } 
        System.out.println("Row " + row + "Has max number of 1's");

 }
*/;
}