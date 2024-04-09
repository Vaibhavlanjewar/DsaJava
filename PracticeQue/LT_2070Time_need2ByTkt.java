public class LT_2070Time_need2ByTkt {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
         int t=0;
        for(int i=1;i<=n;i++){
           
            int j=1;
    
            while(j<=n){
                if(i<=2){
                tickets[j]=tickets[j]-i;
                t++;
            }
                j++;
            }
        }
        return t;
    }
    public static void main(String args[]){
        int tkt[]={2,3,2};
        int k=2;
        System.out.println(timeRequiredToBuy(tkt,k));
    }
}
