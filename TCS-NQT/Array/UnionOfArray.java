import java.util.*;
public class UnionOfArray{ 

  public static ArrayList<Integer>union(int arr1[],int arr2[]){
    TreeSet<Integer>set=new TreeSet<>();

    for(int i:arr1){
    set.add(i);
   }
   for(int i:arr2){
    set.add(i);
    }

    return new ArrayList<>(set);
   
  }

  public static void main(String args[]){
  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
 //nt n2=sc.nextInt();

  int arr1[]=new int[n];
  int arr2[]=new int[n];

  for(int i=0;i<n;i++){
    arr1[i]=sc.nextInt();
   }
  for(int i=0;i<n;i++){
    arr2[i]=sc.nextInt();
   }
  ArrayList<Integer>res=union(arr1,arr2);
   System.out.println(res.toString());
  }

}