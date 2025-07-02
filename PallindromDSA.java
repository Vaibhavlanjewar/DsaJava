public class PallindromDSA{

    public static int isPallindrom(String i){
        char arr[]=i.toCharArray();
        int s=0;
        int e=i.length();
        while(s<e){
            if(arr[s]!=arr[e]){
                return 0;
            }
            s++;
            e--;
           
        }
        return 1;
    }
    public static void main(String args[]){
        String str="i want a radar";
        String arr[]=str.split(" ");

        for(String i:arr){
            if(i.length()>2){
                int res=isPalindrom(i);
                if(res==1){
                    System.out.println(i);
                }
            }
        }
    }
}