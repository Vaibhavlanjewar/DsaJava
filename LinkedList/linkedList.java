class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // methods
    // add()
    // print()
    // search()

    public static Node head;
    public static Node tail;
    public static int size; // size of ll

    public void addFirst(int data) {
        // step 1 create new Node
        // step 2connect newNode to head
        // step 3 connect head to newNode
        Node newNode = new Node(data);
        size++; //size of ll
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(int data){
        Node newNode=new Node(data);
        size++; //size of ll
        if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;
    }

     // add at middle 
     public void add(int idx,int data){
        if(idx== 0){
            addFirst(data); 
        }
        Node newNode=new Node(data);
        size++; //size of ll
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1 ; temp-->prev
        newNode.next=temp.next;
        temp.next=newNode;

    }

    
    // print
    public void print(){
        Node temp=head;
       
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null"+"\n");
    }
 
    // remove first
    public int removeFirst(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
        int val=head.data;
        head=tail=null;
        size--; // dec size 
        return val;
        }
        else{
        int val=head.data;
        head=head.next;
        size--; // dec size
        return val;

    }
}

    // remove last 
    public int removeLast(){
        if(size==0){
          System.out.println("LL is empty");
          return Integer.MIN_VALUE;  
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // prev : index=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
        prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    // Iterative search 
    public int iterative_Search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
              return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursive_Search(int key){
        return helper(head,key);
    }

    // Reverse the list ; 0(n)
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // Question : find and remove the Nth node from End 
    // iterativ eapproach ,question asked by flipkart , amazon ,qualcomm
    public void deleteNthfromEnd(int n){
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head=head.next;
    }
    // sz-n
    int i=1;
    int iToFind=sz-n;
    Node prev=head;
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return ;

    }

    // check LinkedList is Palindrom or not 
    public Node findMid(Node head){
        // tortoise hare -slow fast approach 
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next; 
        }
        return slow; //middle 
    }

    public boolean checkPalindrom(){
        if(head==null ||head.next==null){
            return true;
        }
        // step -1 Find middle
        Node middleNode=findMid(head);

        // step -2 reverse 2nd half
        Node prev=null;
        Node curr=middleNode;
        Node next=middleNode.next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       Node right=prev; //prev is  right half head
       Node left=head ;
       
       // step -3 check left half and right half
       while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
       }
       return true;
    }
    
    // detect cycle 
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    // Detect cycle 
     public static void removeCycle(){
        // detect cycle 
        Node slow=head;
        Node fast=head;
        
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
             }
        } 
        // no cycle 
        if(cycle==false){
            return ;
        }

        // find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
     
    }

    // -----------Merge SOrt -----

    // get mid for merge Sort
    private static Node getMid(Node head){
    Node slow=head;
    Node fast=head.next;  // head.next
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }
     return slow;
}   
private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
            temp.next = head1;
            head1 = head1.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
        }
        temp = temp.next;
    }

    while (head1 != null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }

    while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }

    return mergedLL.next;
}

    // merge sort of linked list
     public Node mergeSort(Node head){
        // base case
        if(head==null || head.next==null){
            return head;
        }
        // find mid
        Node mid=getMid(head);
        // left and right MS
        Node rightHead=mid.next;
        mid.next=null;
       Node newLeft=mergeSort(head);
       Node newRight=mergeSort(rightHead);
       // merge
       return merge(newLeft,newRight);

 
     }

    public static void main(String args[]) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(5);
        // ll.addFirst(55);

        // ll.addLast(55);
        // // ll.print();

        // ll.add(2,9);
        // ll.addFirst(97);
        
        // ll.print();
        // ll.add(2,6);
        // System.out.println(size);
        // System.out.println("deleted node: "+ll.removeFirst());
        // ll.print();

        // ll.removeLast();
        // ll.print();
        
        // // search iteratively  6 is present or not  
        // System.out.println(ll.iterative_Search(6));
        // System.out.println(ll.iterative_Search(9));


        // reverse the list 
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(3);  
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print();
        // ll.reverse();
        // System.out.println("reverse list");
        // ll.print();

        // ll.deleteNthfromEnd(3);
        // System.out.println("delete 3rd node" );
        // ll.print();

        // check ll palindrom or not
        // ll.print();
        // System.out.println(ll.checkPalindrom());

        // detect cylce 
        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;
        // System.out.println(isCycle());
    
        // Remove Cycle 
        // removeCycle();
        // ll.print();


        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(0);

        System.out.println("Original list:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted list:");
        ll.print();
    }

}