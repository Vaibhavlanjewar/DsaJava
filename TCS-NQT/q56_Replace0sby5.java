import java.util.Scanner;

public class q56_Replace0sby5 {
    public static int convertFive(int n){
        //add code here.
        String num=Integer.toString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(ch=='0'){
                sb.append('5');
            }else{
                sb.append(ch);
            }
        }
        return Integer.parseInt(sb.toString());
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(convertFive(n));
        }    
}
