public class avgOfArray {
    public static void main(String args[]){
        // int arr[]={2,6,6,6,8};
        int arr[]={3,1};

        int tot=0;
        for(int i:arr){
            tot+=i;
        }
        tot=tot/2;

        int sum=0;
        boolean flag=false;
        for(int i:arr){
          sum+=i;
          if(sum==tot) flag=true;
        }

        if(flag==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
