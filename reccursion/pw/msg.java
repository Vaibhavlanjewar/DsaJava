

public class msg {
    public static void main(String args[]){
        // hello();
       //Fibbonacci code 
    //   System.out.println(fibbo(5));
     
    //  binary search 
    int arr[]={1,2,6,3,4,5};
    int s=0,e=arr.length;
    int k=3;
    System.out.println(BS(arr,k,s,e));
    }
    static int BS(int[] arr, int k, int s, int e) {
       if(s>e) return -1;
       int mid=s+(e-s)/2;
       if(arr[mid]==k) return mid;
       if(arr[mid]>k){
        return BS(arr,k,mid-1,e);
       }
       return BS(arr,k,s,mid-1);

    }
    static void hello(){
        System.out.println("Hello World");
    }
    static void printN(int n){
        System.out.println(n);
    }

    static int fibbo(int n){
        if(n<2) return n;
        return fibbo(n-1)+fibbo(n-2);

    }
}

