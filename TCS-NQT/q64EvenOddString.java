public class q64EvenOddString {
    public static String oddEven(String s) {
        // code here
        // HashMap<Character,Integer>mp=new HashMap<>();
        
        // int arr[]=new int[26];
        char ch[]=s.toCharArray();
        int odd=0;
        int even=0;
        for(char c:ch){
           
            int a=c-'a' +1;
            if(a%2!=0){
              odd++;
            }
            else{
                even++;
            }
        }
        if(odd%2==0){
           odd=0;
        }
        if(even%2!=0){
            even=0;
        }
        return (odd+even)%2==0?"EVEN":"ODD";
    }
    public static void main(String[] args) {
        String s= "abbbcc";
        System.out.println(oddEven(s));
    }

}
