public class goodString{
    public static String makeGood(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if (Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i + 1)) && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i + 1))) {
                i++; // Skip the next character as well
            } 
            else{
                str.append(s.charAt(i));
            }
        }
        if (s.length() > 0)
            str.append(s.charAt(s.length() - 1));
        return str.toString();
    
    }
    public static void main(String args[]){
        String str="leEeetcode";
        System.out.println("Input string: "+str);
        System.out.print("Output string: ");
        System.out.println(makeGood(str));
    }
}