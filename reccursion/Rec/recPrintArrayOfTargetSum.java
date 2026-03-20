import java.util.ArrayList;

public class recPrintArrayOfTargetSum {
    public static void printSum(int ind,ArrayList<Integer>ds,int sum,int arr[],int n,int target){
         if(sum==target){
            for(int i:ds){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
         }
            if(ind==n){
                return;
            }

            // condition to include the element
            ds.add(arr[ind]);
            sum+=arr[ind];
            printSum(ind+1,ds,sum,arr,n,target);
            // condition to exclude the element
            ds.remove(ds.size()-1);
            sum-=arr[ind];
            printSum(ind+1,ds,sum,arr,n,target);

    }

    public static void main(String args[]){
        int n=3;
        int target=2;
        int arr[]={1,2,1};
         
        ArrayList<Integer>ds=new ArrayList<>();
        printSum(0,ds,0,arr,n,target);
    }
}
