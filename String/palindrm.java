public class palindrm {
    public static boolean ispalindrom(String str){
            str=str.toLowerCase();
            for(int i=0;i<str.length();i++){
                char start=str.charAt(i);
                char end=str.charAt(str.length()-1-i);
                if(start!=end){
                    return false;
                       }
                
            }
            return true; 
    }

    public static void main(String args[]) {
         String v="aba";
         System.out.println(ispalindrom(v));
    }
}
