public class DiagonalSum {

    public static int diagonalSum(int Matrix[][]){
        int sum=0;
    
        // meth 1 0(n^2)
        // for(int i=0;i<Matrix.length;i++){
        //     for(int j=0;j<Matrix[0].length;j++){
        //         // primary diagonal sum 
        //         if(i==j){
        //             sum+=Matrix[i][i];
        //         }
        //         else if(i+j==Matrix.length-1){
        //             // secondary sum
        //             sum+=Matrix[i][j];
        //         }
        //     }
        // }


        // o(n) approach 
        for(int i=0;i<Matrix.length;i++){
        //  primary diagonal sum 
         sum+=Matrix[i][i];

        //  secondary diagonal sum
        sum+=Matrix[i][Matrix.length-1-i];
        }
        return sum;
        
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                    };
                    System.out.println(diagonalSum(matrix));
                
    }
}
