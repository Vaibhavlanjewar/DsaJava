public class friends_pairing {

    public static int friendparing(int n){
        if(n==1 || n==2) return n;
        return friendparing(n-1)+(n-1)*friendparing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendparing(4 ));
    }
    
}
