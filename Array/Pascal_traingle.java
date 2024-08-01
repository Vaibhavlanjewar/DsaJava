import java.util.ArrayList;

public class Pascal_traingle {
    public static void main(String args[]){
        // first type -given a row and colm print the element 
        // 2
        // op
        // 1 1
       int row=5,col=3;
    //    ArrayList<Integer>ans=ncr(row,col);
    //    System.out.println(ans);
    ncr(row);
    }
    public static void ncr(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        long res=1;
        int a=0;
        for(int i=0;i<n;i++){
            res*=(n-i);
            res/=i+1;
            a=(int)res;
            System.out.println(a);
        }
       
     
    }
}
