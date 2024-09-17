
import AccessModifire.J21A;
import InheritancePackage.*; // import this packafge for J21A class , protected marks variable is mentioned 

class C extends J21A{
    public void abc(){
        System.out.println(marks);  // protected variable marks inside the J21A is accessible in other package in subclass which in inherited by the J21A class of AccessModifire package 
    }
}
public class J23Bacc {
    public static void main(String args[]){
        J22AccessModifie ob=new J22AccessModifie();
        System.out.println(ob.marks); // marks from the J22AccessModifire has no access Modifire , is Accessiblw in this class also 
        // Default access Modifire

        System.out.println(ob.phy);// public inside same - diif package 
        
        System.out.println(ob.score); //protected  inside same package , 


    //    J21A pr=new J21A();
    //    System.out.println(pr.marks);// marks in not visible , i.e outside the package in diifrent classs the protected instance variable is not accessible  , but accessible in sub class which in inherited by class 

    }
}
