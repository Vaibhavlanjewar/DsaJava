public class revWordinString {

    public static String revWord(String s){
        String words[]=s.split(" +");
        StringBuilder sb=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
           
            sb.append(words[i]);
            if(i>=1){
            sb.append(" ");
            }
        }
        return sb.toString();
    } 
    public static void main(String args[]){
      String s="the sky is blue";
    //   blue is sky the
    System.out.println(revWord(s));

    }
}
