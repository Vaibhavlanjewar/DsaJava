public class J12_2dArray {
    public static void main(String args[]){
        int num[][]=new int[2][2];

        num[0][0]=1;
        num[0][1]=5;
        num[1][0]=6;
        num[1][1]=7;

    //     for(int i=0;i<2;i++){
    //         for(int j=0;j<2;j++){
    //             System.out.print(num[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();

    for(int n[]:num){
       for(int m:n){
        System.out.print(m+ " ");
       }
       System.out.println();
    }
    }
}
