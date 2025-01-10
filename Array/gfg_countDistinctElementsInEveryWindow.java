import java.util.ArrayList;
import java.util.HashSet;

public class gfg_countDistinctElementsInEveryWindow {
    static ArrayList<Integer> countDistinct(int arr[], int k) {
            // code here
           
             ArrayList<Integer>res=new ArrayList<>();
            
            for(int i=0;i<arr.length;i++){
                 HashSet<Integer>set=new HashSet<>();
                 if(i+k-1<arr.length){
                for(int j=i;j<i+k;j++){
                    set.add(arr[j]);
                }
               res.add(set.size());
                 }
            }
            return res;
        }
        public static void main(String[]args){
            int arr[]={1, 2, 1, 3, 4, 2, 3};
            int k=4;
            System.out.println(countDistinct(arr,k));
    }
}
