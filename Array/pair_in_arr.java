public class pair_in_arr {
    public static void pairInArr(int num[]){
        int tp=0 ; //tot pair
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                tp++;
                System.out.println("(" + curr + "," + num[j] + ")" );
            }
            System.out.println();
        }
        System.out.println("tot pair: "+tp);
    }

    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        pairInArr(num);
    }
}
