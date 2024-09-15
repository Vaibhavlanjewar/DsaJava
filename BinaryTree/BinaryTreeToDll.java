/*import java.util.ArrayList;

class BinaryTreeToDll{
Node dll(ArrayList<Integer>io){
        Node dummy=new Node(0);
        Node current=dummy;
        for(int i:io){
            Node newNode = new Node(i);
            current.right=newNode;
            newNode.left=current;
            current=newNode;
           
        }
        if(dummy.right!=null){
            dummy.right.left=null;
        }
        return dummy.right;
    }
    void inorder(Node root,ArrayList<Integer>ino){
        if(root==null)return ;
        // inorder left root right
        inorder(root.left,ino);
        ino.add(root.data);
        inorder(root.right,ino);
    }
    
    Node bToDLL(Node root)
    {
       ArrayList<Integer>ino=new ArrayList<>();
       inorder(root,ino);
       Node res=dll(ino);
       return res;
    }
}
    
https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1
*/