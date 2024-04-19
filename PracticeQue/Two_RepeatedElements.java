import java.util.HashSet;

public class Two_RepeatedElements {
    public static void twoRepeated(int arr[],int n ){
       int ans[]=new int[n];
       int j=0;
       HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<arr.length;i++){
          if(!set.contains(arr[i])){
            ans[j++]=arr[i];
          }
          else{
            set.add(arr[i]);
          }
       }

    for(int i=0;i<2;i++){
        System.out.println(ans[i]+" ");
    }
}
public static void main(String args[]){
    int n=4;
    int arr[]={1,2,1,3,4,3};
    twoRepeated(arr, n);

}
}
