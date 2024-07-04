/*You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

Return the head of the modified linked list.

*/ 

// import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
     this.val=data;
     this.next=null;
    }
}

//  https://leetcode.com/problems/merge-nodes-in-between-zeros/?envType=daily-question&envId=2024-07-04
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode head1=head;
        int sum=0;
        if(head1 ==null || head1.next==null) return null;
        ListNode temp=head1.next;
        ListNode ans=new ListNode(0);
        ListNode res=ans;
        while(temp !=null){
            if(temp.val==0){
                  if (sum != 0){
                     res.next=new ListNode(sum);
                     res=res.next;
                     sum=0;
                  }
                
            }
           else{
             sum+=temp.val;
           }
            temp=temp.next;
        }
        return ans.next;
    }
}