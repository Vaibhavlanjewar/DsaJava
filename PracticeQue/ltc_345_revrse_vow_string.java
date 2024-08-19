import java.util.HashSet;
// https://leetcode.com/problems/reverse-vowels-of-a-string/solutions/5662036/two-pointer-approach/
public class ltc_345_revrse_vow_string {
        public static void swap(char[] ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public static String reverseVowels(String s) {
        HashSet<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        char [] ch=s.toCharArray();
         int i=0,j=ch.length-1;
      while(i<=j){
        if(set.contains(ch[i]) && set.contains(ch[j])){
            swap(ch,i,j);
            i++;
            j--;
        }
        else if(set.contains(ch[i])  && !set.contains(ch[j])){
            j--;
        }
        else{
            i++;
        }
      }
      
      StringBuilder sb=new StringBuilder();
      for(int k=0;k<ch.length;k++){
        sb.append(ch[k]);
      }
      return sb.toString();
    }

    public static void main(String args[]){
         System.out.println( reverseVowels("hello"));
    }
}
