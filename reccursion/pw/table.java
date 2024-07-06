public class table {
    public static void main(String args[]){
        int n=3;
        int tab[][]=new int[10][n];
        for(int i=0;i<10;i++){
            
            for(int j=0;j<n;j++){
                tab[i][j]=(i+1)*(j+1);
            }
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<n;j++){
                System.out.print(tab[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
