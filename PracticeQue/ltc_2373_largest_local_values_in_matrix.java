public class ltc_2373_largest_local_values_in_matrix {
    /*https://leetcode.com/problems/largest-local-values-in-a-matrix/ 
    Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]*/
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int maxLocal[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max=Integer.MIN_VALUE;
                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){
                        max=Math.max(max,grid[x][y]);
                    }
                }
                maxLocal[i][j]=max;
            }
        }
        return maxLocal;
    }
}