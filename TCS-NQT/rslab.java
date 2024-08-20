public class rslab {
    public static void main(String args[]){
        // rslab 
        // int []arr=new int[]{1,2,3,4,5,6,7,8,9,10,1};
        // for(int i=0;i<=arr.length;i++){
        //     System.out.println(arr[i]);
        // }

    //     String x="Addresses";
    //     String ans="";
    //     for(int i=0;i<x.length();i++){
    //         int count=0;
    //         for(int j=i;j<x.length();j++){
    //             if(x.charAt(i)==x.charAt(j)){
    //                 count++;
    //             }
               
    //         }
    //         ans+=x.charAt(i)+Integer.toString(count);
    // }
    // System.out.println(ans);

    // for(int i=1;i<=3;i++){
    //     for(int j=1;j<=i*3;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    /*
    ***
    ******
    ********* 
     */


    //  int in=30;
    //  if(in%3==0){
    //     System.out.print("Raja ");
    //  }
    //  else if(in%5==0){
    //     System.out.print("Software ");
    //  }
    //  if(in%3==0 && in%5==0){
    //     System.out.print("Raja software ");
    //  }
    //  else{
    //     System.out.print("No");
    //  }
// Raja Raja software 
//    int arr[]={0,0,1,1,1,2,2,3,3,4};
//    int i=0;
//    for(int j=1;j<arr.length;j++){
//     if(arr[j]!=arr[i]){
//        i++;
//        arr[i]=arr[j];
//      }
//      System.out.println(arr[i]);
//     }
//     System.out.println(i+1);

int a[]={2,4,5,7,1,8,9};
int sum=0;
for(int i=0;i<a.length-1;i++){
   if(a[i]%2==1){
    sum+=a[i];
    System.out.println(a[i]);
   }
}
System.out.println(sum);
}
}

//  6 + 15 + 14 +19 +20  c 