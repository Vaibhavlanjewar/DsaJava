import java.util.*;
class majorityElement {

    public static void main(String[]args){
   
    Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
     
        for(int i=0;i<n;i++){
           int a=sc.nextInt();
           arr[i]=a;
        }
 
       int el=majorityElement(arr);
       System.out.println(el);
    }

    public static int majorityElement(int[] arr) {
        int n=arr.length;
         int cnt=0;
         int el=arr[0];
         for(int i=0;i<n;i++){
          if(cnt==0){
            cnt=1;   
            el=arr[i];
            }
          else if(arr[i]==el){
            cnt++;
           }
         }
        int cnt1=0;
        for(int i:arr){
         if(i==el) cnt1++;
         }
         if(cnt1>n/2) return el;
         else return -1;
    }
}