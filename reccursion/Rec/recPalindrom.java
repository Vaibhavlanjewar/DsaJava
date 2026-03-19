public class recPalindrom {
    public static boolean pal(int i,String str){
        if(i>=str.length()/2)return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1))return false;
        return pal(i+1,str);
    }
    public static void main(String[] args) {
        System.out.println(pal(0, "radar")); // true
        System.out.println(pal(0, "hello")); // false
    }
}
