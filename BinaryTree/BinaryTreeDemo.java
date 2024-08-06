import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDemo {
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

    // Preorder traversal (root, left, right)
    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Postorder traversal (left, right, root)
    public static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Level order traversal
    public static void levelOrderBfs(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null); // For printing new line
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(); // New line
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
            }
        }
    }

    // Height of tree
    public static int height(Node root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }

    // Count the nodes
    public static int count(Node root) {
        if (root == null) return 0;
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return 1 + leftCount + rightCount;
    }

    // Diameter of Tree Approach 1 (O(n^2) time complexity)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDim = diameter(root.left);
        int leftHt = height(root.left);

        int rightDim = diameter(root.right);
        int rightHt = height(root.right);

        int selfDim = leftHt + rightHt + 1;
        return Math.max(selfDim, Math.max(leftDim, rightDim));
    }

    // Diameter of tree Approach 2 (O(n) time complexity)
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter1(Node root) {
        if (root == null) return new Info(0, 0);
        Info leftInfo = diameter1(root. left);
        Info rightInfo = diameter1(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    // Subtree of another tree
    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) return true;
        else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) return false;
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    // ---------------------------
    // -----------Top view of Tree----------------
    static class Info1{
        Node node;
        int hd;
        public Info1(Node node,int hd){
           this.node=node;
           this.hd=hd;
        }
    }
    public static void TopView(Node root){
        Queue<Info1>q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info1(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info1 curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
        else{
            if(!map.containsKey(curr.hd)){ //first time   hd is occuring 
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null){
                q.add(new Info1(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info1(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }

        } 

        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data);
        }
        System.out.println();
    }

    // Kth level of tree 
    public static void Klevel(Node root,int level,int k){
        if(root==null) return ;
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left,level+1, k);
        Klevel(root.right,level+1, k);

    }

    // -------------------Lowest common ancesstor -------------------------
    public static boolean getPath(Node root,int n,ArrayList<Node>path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundLeft=getPath(root.left,n,path);
        boolean foundRight=getPath(root.right, n, path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node  lca(Node root,int n1,int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        
        getPath(root,n1,path1);
        getPath(root,n2,path2); 
        // last common ancestor
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        // last equal Node --> i-1
        Node lca=path1.get(i-1);
        return lca;
    }

    // ---------------- Minimum distance between 2 nodes 
    public static int lcaDist(Node root,int n){
        if(root==null)return -1;
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left,n);
        int rightDist=lcaDist(root.right, n);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        else if(leftDist ==-1){
            return rightDist+1;
        }
       else{
           return leftDist+1;
        }
    }
    public static int minDist(Node root,int n1, int n2){
        Node lca1=lca(root,n1,n2);

        int dist1=lcaDist(lca1,n1);
        int dist2=lcaDist(lca1,n2);
       return dist1+dist2;
    }

    // ------------------Transform tree to sum tree ----------------------

    public static int transform(Node root){
        if(root==null) return 0;

        int leftChild=transform(root.left);
        int rightChild=transform(root.right);

        int data=root.data;

        int newLeft = root.left==null ? 0 :root.left.data;
        int newRight=root.right==null ? 0:root.right.data;

        root.data=newLeft+ leftChild + newRight + rightChild;
        return data ;

    } 
    
// ----------------------------------------------------------
     public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 7, 6, -1, -1, -1, -1};
        int subTreeNodes[] = {2, 4, -1, -1, 5, -1, -1}; // Subtree 2-4-5

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        BinaryTree.idx = -1; // Reset index for the subtree
        Node subRoot = tree.buildTree(subTreeNodes);

        System.out.println("Root data: " + root.data);

        System.out.println("Preorder");
        preOrder(root);

        System.out.println("\nPostorder");
        postOrder(root);

        System.out.println("\nLevel order traversal");
        levelOrderBfs(root);

        System.out.println("\nHeight of tree: " + height(root));

        System.out.println("Count of nodes: " + count(root));

        System.out.println("Diameter of tree (Approach 1): " + diameter(root));

        System.out.println("Diameter of tree (Approach 2): " + diameter1(root).diam);

        System.out.println("Is subtree present: " + isSubTree(root, subRoot));

        System.out.println("Top view of tree ");
        TopView(root);

        System.out.println("\n Kth Level");
        int k=2;
        Klevel(root, 1,k);

        System.out.println("Lowest common anccestor");
        int n1=4,n2=1;
        System.out.println(lca(root,n1 ,n2 ).data);

        // minminum distance 
        System.out.println("Minimum distance bet two node "+minDist(root,4,5));

        // transform the 
        transform(root);
        preOrder(root);
    }
}
