import java.util.Stack;

public class nextGreaterElement {
    public static void main (String args[]){
        int[] arr={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nextGreter[]=new int[arr.length];
        // s.push(-1);
        for(int i=arr.length-1;i>=0;i--){
            // 1
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // 2
            if(s.isEmpty()){
                nextGreter[i]=-1;
            }
            else{
                nextGreter[i]=arr[s.peek()];
            }
            //3
            s.push(i);

        }
        for(int i=0;i<nextGreter.length;i++){
            System.out.print(nextGreter[i]+" ");

        }
        System.out.println();
        
    }
    
}
