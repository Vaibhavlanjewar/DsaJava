import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
     String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    @Override 
    public String toString(){
       return "Student [age=" +age +", Name="+name+ "]";
    }

    public int compareTo(Student that){
        return this.age-that.age;
    }
}
public class J53Comaparatr {

   

    public static void main(String args[]){
        // comaparator to sort 

          // sort on the basis of unit place digit ,
          Comparator<Integer>com=new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10>j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
          };

          Comparator<String>ComString=new Comparator<String>() {
            public int compare(String i,String j){
                if(i.length()>j.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
          };

        // ArrayList<Integer>arr=new ArrayList<>();
        // arr.add(43);
        // arr.add(31);
        // arr.add(72);
        // arr.add(29);

        // System.out.println("B4 sorting "+arr);
        // // sort using Collection.sort()

        // // using comaparator  , obj  com 
        // Collections.sort(arr,com);
        // System.out.println("Sorted array is: "+arr);


        // // sort the String on the basis of length 
        // ArrayList<String>str=new ArrayList<>();
        // str.add("aaa");
        // str.add("aaaa");
        // str.add("a");
        // str.add("aa");
        // System.out.println("B4 sorting "+str);
        // // sort using Collection.sort()
        // Collections.sort(str,ComString);
        // System.out.println("Sorted array is: "+str);


      // student class 
    
    //   Comparator<Student>stdComp=new Comparator<Student>() {
    //     public int compare(Student i,Student j){
    //         if(i.age>j.age){
    //             return 1;
    //         }
    //         else{
    //             return -1;
    //         }
    //     }
    //   };


      ArrayList<Student>stud=new ArrayList<>();
      stud.add(new Student(21,"vnbl"));
      stud.add(new Student(18,"suraj"));
      stud.add(new Student(25,"alekh"));
      stud.add(new Student(25,"abhi"));


       System.out.println("b4 sorting"+stud);
       Collections.sort(stud);
       for( Student s:stud){
        System.out.println(s);
       }


    }
}
