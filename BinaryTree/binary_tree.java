import java.util.LinkedList;
import java.util.Queue;

public class binary_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // preOrder root left rigth
    public static void preOrder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
  
    // Post order  left right root
    public static void postOrder(Node root){
        if(root==null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    
    // Level Order
     public static void levelOderBfs(Node root){
        if(root==null) return ;
        Queue<Node>q=new LinkedList<>();

        q.add(root);
        q.add(null); //for printing new line
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode ==null){
                System.out.println(); //new line
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null)q.add(currNode.right);
            }
           
        }
    }

    // height of tree
    public static int height(Node root){
        if(root==null)return 0;

        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
  

    // count the nodes 
    public static int count(Node root){
        if(root==null) return 0;
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return 1+(leftCount+rightCount);

    }


    // Diameter of Tree
    public static int diameter(Node root){
        if(root ==null){
            return 0;
        }

        int leftDim=diameter(root.left);
        int leftHt=height(root.left);

        int rightDim=diameter(root.right);
        int rightHt=height(root.right);

        int selfDim=leftHt+rightHt+1;
        return Math.max(selfDim,Math.max(leftDim,rightDim));

    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root data: " + root.data);
        // 0(n) time complexity 
        System.out.println("Preorder");
        preOrder(root);
        // postOrder
        System.out.println("\nPostorder");
        postOrder(root);
        System.out.println("\nlevelOrder traversal");
        levelOderBfs(root);

        // height of tree 
        System.out.println("\n Height of tree :"+height(root));

        // count the nodes 
        System.out.println("Count of nodes: "+count(root));

        // Diameter of Tree 
        System.out.println("Diamer of tree : "+diameter(root));
        
    }
}
