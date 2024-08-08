import java.util.ArrayList;

public class Binary_Search_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // search in bst
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // delete Node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete((root.left), val);
        } else {
            // case case1-leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3 both children present
            // find inorder inorder Successor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
        printInRange(root.left,k1,k2);
        System.out.print(root.data+ " ");
        printInRange(root.right,k1,k2);
        }

        if(root.data>k1){
            printInRange(root.left,k1,k2);
        }
        else{
            printInRange(root.right,k1,k2);
        }
    }
// -------------------------------------------------------
// print root 2 leaf path
   public static void printPath(ArrayList<Integer>path){
    for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+ "->");
    }
    System.out.println("null");
   }

    public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
        if(root==null) return ;
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
       
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }

    // Is Valid Bst
    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null)return true;
        if(min!=null && root.data<=min.data){
         return false;
        }
        else if(max!=null &&root.data>=max.data){
            return false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);

    }
    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println("Inorder:");
        inorder(root);
        System.out.println("\nSearch in bst");
        if (search(root, 3)) {
            System.out.println("Element is Found");
        } else {
            System.out.println("Element is not found");
        }

        // delete node
        System.out.println("\nDelete Node");
        root = delete(root, 10);
        inorder(root);
        
        // PrintIn range 
        System.out.println("\nPrint in range 5-12");
        printInRange(root,5,12);
       
    //   print root 2 leaf
     System.out.println("\n\nPrint root to path");
     printRoot2Leaf(root,new ArrayList<>());
 
    //  Is valid Bst
    if(isValidBst(root, null, null)){
        System.out.println("\nValid bst");
    }
    else{
        System.out.println("Not valid");
    }

    }
}
