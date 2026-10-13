package BinaryTrees;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node right;
    Node left;
    Node(int val){
        this.val = val;
    }
}
public class Implimentation {
    static void main(String[] args) {
         /*
                    3
                  /   \
                 4      10
               /  \    / \
             -1    1  6    9

          */
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(10);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.print("binary tree element: ");
        dispaly(a);
        System.out.println();
        System.out.println("size of the tree: "+size(a));
        System.out.println("Sum of Binary tree: "+sum(a));
        System.out.println("Product of a Binary tree: "+product(a));
        System.out.println("max element in the Binary tree: " +max(a));
        System.out.println("Minimum of value of Binary tree: " + min(a));
        System.out.println("levels of a Binay tree: "+ levels(a));
        System.out.println("========================================");
        System.out.println("PREORDER , INORDER , POSTORDER ELEMENT");
        System.out.println("========================================");
        System.out.print("preorder element: ");
        preorder(a);
        System.out.println();
        System.out.print("inorder element: ");
        inorder(a);
        System.out.println();
        System.out.print("PostOrder element: ");
        postOrder(a);
        System.out.println();
        System.out.print("levels by print element=");
        levelOrder(a);
    }
//size of the Binary tree
    private static int size(Node root) {
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    //print the element of treee
    private static void dispaly(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        dispaly(root.left);
        dispaly(root.right);
    }
    //sum of a binary tree
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return root.val + (sum(root.left) + sum(root.right));
    }
    //product of a binary tree
    public static int product(Node root){
        if(root == null ){
            return 1;
        }
        return root.val * ( product(root.left ) * product(root.right));
    }
    // maximum of a binary tree
    public static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    // Minimum tree of a Binary tree
    public static int min(Node root ){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    // level of a Binary tree
    public static int levels(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    //Preorder Binary tree
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder of a binary tree
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    //post order in a binary tree
    public static void postOrder(Node root){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    // lever order print element
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left != null){
                q.add(front.left);
            }
            if(front.right != null){
                q.add(front.right);
            }
        }
        System.out.println();
    }
}
