import java.util.ArrayList;
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/?envType=daily-question&envId=2024-07-19
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n=matrix.length; //row
        int m=matrix[0].length; //col
        ArrayList<Integer>row=new ArrayList<>();
       
        for(int i=0;i<n;i++){
            int minRow=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
             minRow=Math.min(minRow,matrix[i][j]);
            }
            row.add(minRow);
        }
        ArrayList<Integer>col=new ArrayList<>();
        for(int i=0;i<m;i++){
            int maxCol=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                maxCol=Math.max(maxCol,matrix[j][i]);
            }
            col.add(maxCol);
        }

        List<Integer>ln=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==row.get(i) && matrix[i][j]==col.get(j)){
                    ln.add(matrix[i][j]);
                }
            }
        }
        return ln;
    }

    public static void main(String args[]){

    }
}
