// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class day {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
    //   input value of v tot vehicle 
    int v=sc.nextInt();
    //   input value of w , tot wheels 
    int w=sc.nextInt();
    
    if(w>=2 && w%2==0 && v<w){
        int fw=0;
        int tw=0;
        
        fw=(w-2*v)/2;
        tw=v-fw;
        
        System.out.println("TW="+tw+"FW="+fw);
    }
        
    }
}