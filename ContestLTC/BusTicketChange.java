public class BusTicketChange {
        public static boolean canServe(int[] arr) {
        // code here
        int sum5=0;
        for(int i:arr){
            if(i==5)sum5+=5;
        }
        
        for(int i:arr){
            if(i!=5){
                int ticket=i-5;
                sum5=sum5-ticket;
            }
        }
        if(sum5>=0)return true;
        else return false;
    }
    public static void main(String[] args) {
        int[] arr={5,5,10,10,20};
        System.out.println(canServe(arr));
    }
}
