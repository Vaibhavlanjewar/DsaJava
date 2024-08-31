/*
 Addition of two square matrices
Difficulty: BasicAccuracy: 63.09%Submissions: 11K+Points: 1
Given two square matrices matrixA and matrixB of size n x n.  Find the addition of these two matrices.

Note :- You don't have to return anything in this question (Refer YourTask section).
 

Example 1:

Input: matrixA = {{1, 2}, {3, 4}},
matrixB = {{4, 3}, {2, 1}}
Output: {{5, 5}, {5, 5}}
Example 1:

Input: matrixA = {{2, 2}, {2, 2}},
matrixB = {{3, 3}, {3, 3}}
Output: {{5, 5},{5, 5}}
 

Your Task:
You don't need to read or print anything. Your task is to complete the function Addition() which takes matrixA and matrixB as input parameters and adds two matrices. Do the addition without using extra memory. The output matrix must be in matrixA.
 

Expected Time Complexity: O(n2)
Expected Space Complexity: O(1)
 

Constraints:
1 <= n <= 100
 */

 import java.util.*;
 public class q29_additionOfTwoMatrix {
 
      public static void  Addition(int[][] matrixA, int[][] matrixB)
     {
       int n=matrixA.length;
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             matrixA[i][j]+=matrixB[i][j];
          }
       }
     }
     public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int mat1[][]=new int[n][n];
      int mat2[][]=new int[n][n];
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
           mat1[i][j]=sc.nextInt();
           }
      }
 
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
           mat2[i][j]=sc.nextInt();
           }
      }
       
     Addition(mat1,mat2);
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
         System.out.print(mat1[i][j]+" ");         
         }
      }
    }
 
     }
 
 