
 class Node{
    int val;
    Node next=null;
    Node(int data,Node head){
        this.val=data;
        this.next=head;
    }
    Node(int data){
        this.val=data;
        this.next=null;
    }
}
public class linkedlist {
    
   public static Node convertArr2LL(int arr[]){
    Node head=new Node(arr[0]);
    Node mover=head;
    for(int i=1;i<arr.length;i++){
    Node nd=new Node(arr[i]);
    mover=nd;
    }
    return head;
   } 

   public static void main(String args[]){
    int arr[]={1,2,3,4};
    Node head=convertArr2LL(arr);
    while(head !=null){
        System.out.println(head.val);
        head=head.next;
    }
   }
}
