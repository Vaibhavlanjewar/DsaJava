import java.util.ArrayList;

public class recCombinationSum {
    public static  void findCombinations(int ind ,int arr[],int target,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ds){

    if(ind==arr.length){
        if(target==0){
            ans.add(new ArrayList<>(ds));
        }
        return ;
    }

    if(arr[ind]<=target){
        ds.add(arr[ind]);

        // pick 
        findCombinations(ind,arr,target-arr[ind],ans,ds);

        ds.remove(ds.size()-1);
    }
    findCombinations(ind+1,arr,target,ans,ds);
}

    public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        int ind=0;
        findCombinations(ind,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    public static void main(String args[]){
        int arr[]={2,3,6,7};
        int target=7;
        combinationSum(arr,target);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();

        for(ArrayList<Integer>list:ans){
            System.out.println(list);
        }
    }
}

