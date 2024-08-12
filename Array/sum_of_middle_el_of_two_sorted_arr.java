import java.util.ArrayList;

public class sum_of_middle_el_of_two_sorted_arr {
     public static int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
       int i=0,j=0;
       int n1=arr1.length;
    //   int n2=arr2.length;
       while(i<n1 && j<n1){
          
           if(arr1[i]<arr2[j]){
               ans.add(arr1[i]);
               i++;
           }
           else{
               ans.add(arr2[j]);
               j++;
           }
       }
       while(i<n1){
           ans.add(arr1[i]);
           i++;
       }
       while(j<n1){
           ans.add(arr2[j]);
           j++;
       }
      
      
       return (ans.get(n1)+ans.get(n1-1));
       }
       public static void main(String[] args) {
        int arr1[]={1, 2, 4, 6, 10};
        int  arr2[]={4, 5, 6, 9, 12};
       System.out.println( SumofMiddleElements(arr1,arr2));
    
       }
    
}
