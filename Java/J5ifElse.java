public class J5ifElse {
    
public static void main(String args[]){
    int age=19;

    if(age>=18){
        System.out.println("You are eligible for voting");

    }
    else{
        System.out.println("You are not eligible for voting");

    }

   
    // print greater elements
    int a=5;
    int b=10;
    int c=1;
    if(a>b && a>c){
        System.out.println("a ids greater");
    }
    else if(b>c){ // b>a && b>c , but here we have aleady checked that , b is maller than a
        System.out.println("b is greater");
    }
    else{
        System.out.println("c is greater");
    }


}
}
