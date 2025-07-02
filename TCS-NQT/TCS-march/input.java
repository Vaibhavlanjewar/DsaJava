import java.util.*;
public class input{
  public static void main(String []args){

  Scanner sc=new Scanner(System.in);
  String  inp=sc.nextLine();
  
  String str[]=inp.split(",");

  int arr[]=new int[str.length];
  
  for(int i=0;i<str.length;i++){
     int n=Integer.parseInt(str[i]);
     arr[i]=n;
    } 

  
 
   for(int i:arr){
     System.out.print(i);
    }
 
 }

}