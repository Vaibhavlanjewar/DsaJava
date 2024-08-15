import java.util.*;

public class q66{

public static void main(String args[]){ 
   
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();

  char[]color=new char[n];
  for(int i=0;i<n;i++){
     color[i]=sc.next().charAt(0);
    }
  
  int []upper=new int[26];
  int []lower=new int[26];
  for(int i=0;i<n;i++){
   if(color[i]>='A' && color[i]<='Z'){
     upper[color[i]-'A']++;
     }
   }
  
   for(int i=0;i<n;i++){
   if(color[i]>='a' && color[i]<='a'){
     upper[color[i]-'a']++;
     }
   }
   
  boolean flag=false;
  char ch='\0';
  for(int i=0;i<n;i++){
  if(color[i]>='A' && color[i]<='Z'){
   if(upper[color[i]-'A']%2==1){
     ch=(char)(color[i]);
     flag=true;
     break;
    }
   }
   else if(color[i]>='a' && color[i]<='z'){
   if(upper[color[i]-'a']%2==1){
     ch=(char)(color[i]);
     flag=true;
     break;
    }
   }

  }
 
  if(flag==true){
   System.out.println(ch);
  }
  else{
    System.out.println("All are even");
   }

}

}