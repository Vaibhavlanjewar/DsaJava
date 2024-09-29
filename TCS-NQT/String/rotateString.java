import java.util.*; 
public class rotateString{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String goal=sc.nextLine();

    boolean res=s.length()==goal.length() && (s+s).contains(goal);
    System.out.print(res);
   }
 }