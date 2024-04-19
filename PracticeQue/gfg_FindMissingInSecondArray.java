import java.util.ArrayList;
import java.util.HashSet;

public class gfg_FindMissingInSecondArray {
    public static ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        //https://www.geeksforgeeks.org/problems/in-first-but-second5423/1
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<m;i++) set.add(b[i]);
        
        for(int j=0;j<n;j++){
            if(!set.contains(a[j])){
                ans.add(a[j]);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int a[] = {1, 2, 3, 4, 5, 10};
        int b[] = {2, 3, 1, 0, 5};
        int n=6,m=5;
        System.out.println(findMissing(a, b, n, m));

    }
   
}
