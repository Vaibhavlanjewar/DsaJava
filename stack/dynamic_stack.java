// package DS-IN-JAVA1.java.stack;

public class dynamic_stack {
    public static int cap=2;
    public static int stack[]=new int[cap];
    public static int top=0;


public static  void push(int data){
     if(size()==cap){
         expand();
     }
       else{
        stack[top]=data;
      //  System.out.print("\nPushed: "+ stack[top]);
        top++;
      }
}
private static void expand() {
   
   int length=size();
   int newStack[] = new int [cap*2];
   System.arraycopy(stack, 0,newStack,0,length);
   stack=newStack;
   cap*=2;
//    for (int i=0;i<length;i++) {
//     newStack[i] = stack[i];
//    }

}
public static int pop(){
    int data=0;
    if(isEmpty()){
     System.out.println("Stack is empty \n");
    }
    else{
    top--;
    data= stack[top];
    stack[top]=0 ;//-1
    shrink();
    }
   return data;
 
}

private static void shrink() {
    int length=size();
    if(length<=(cap/2)/2){
        cap=cap/2;
    }
    int newStack[]=new int[cap];
    System.arraycopy(stack,0,newStack,0,length);
}
// peek , we dont delete the top 
public static int peek(){
    int data;
    data =stack[top-1];
    return data;
}
public static int size(){
  return top;
}
public static boolean isEmpty(){
  return top<=0;
}
public static void show(){
    System.out.println("My stack ");
    for(int el :stack){
        System.out.println(el + " ");
    }
    System.out.println("\n");
}
public static void main (String args[]){
System.out.println("Stack implementation ");
  
      push(5);
      push(10);
      show();
      System.out.println("\n peek: "+ peek());
     
      System.out.println("size is: "+ size());
     System.out.println("pop: "+ pop());
    System.out.println("pop: "+ pop());
    System.out.println("pop: "+ pop());
      
      show();
    push (45);
    show();
      System.out.println(isEmpty()?"The Stack is Empty":"The Stack is not empty"); // ternary op 
}

}