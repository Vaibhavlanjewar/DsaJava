public class printSubArr {
    public static void subArr(int num[]){
        int ts=0;
        int n=num.length;
       
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Tot subArr: "+ts);

    }

    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        subArr(num);
    }
  
}
