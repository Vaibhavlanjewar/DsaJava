public class ltc_636_sum_of_square_of_num{
    public static boolean srtOf(int c){
        long a=0;
        long b=(long)Math.sqrt(c);
        while(a<=b){
            long sum=a*a+b*b;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                a++;

            }
            else b--;
        }
        return false;

    }
    public static void main(String args[]){
        int c=5;
        System.out.println(srtOf(c));
        }
}