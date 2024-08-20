public class floodFill_img {
    
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
       int m=image[0].length;
       boolean vis[][]=new boolean[n][m];
       
       helper(image,sr,sc,color,vis,image[sr][sc]);
       return image;
   }
    public static void helper(int [][]image,int sr,int sc,int color,boolean [][]vis,int orgCol){
   
   if(sr<0 ||sc<0 ||sr>=image.length ||sc>=image[0].length ||vis[sr][sc] || image[sr][sc] !=orgCol){
       return;
   }

   if (image[sr][sc]==color||image[sr][sc]!=orgCol) return;
       image[sr][sc]=color;
       //   left
    helper(image,sr,sc-1,color,vis,orgCol);
   // right
   helper(image,sr,sc+1,color,vis,orgCol);
   // up
   helper(image, sr-1, sc, color, vis, orgCol);
   // down
   helper(image, sr+1, sc, color, vis, orgCol);
   }
    public static void main(String args[]){
          int [][] image={
               {1,1,1},
               {1,1,0},
               {1,0,1}
          };

          int sr=1,sc=1,color=2;
       image=floodFill(image,sr,sc,color);

       int n=image.length;
       int m=image[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(image[i][j]+" ");
        }
        System.out.println();
       }

    }
}
