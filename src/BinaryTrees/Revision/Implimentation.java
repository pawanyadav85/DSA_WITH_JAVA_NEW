package BinaryTrees.Revision;

import java.util.LinkedList;
import java.util.Queue;

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
        System.out.print("Element of Binary treee : ");
        display(a);
        System.out.println();
        System.out.println("Size of Binary tree is : " + size(a));
        System.out.println("sum of the nodes are : " + sum(a));
        System.out.println("Product of Binary tree is : " + Product(a));
        System.out.println("Product with zero element : " + ZeroProduct(a));
        System.out.println("Maximum of a binary tree : " + Max(a));
        System.out.println("Minimum of a binary tree : " + Min(a));
        System.out.println("Level of a Binary tree : " + Level(a));
        System.out.print("Preorder traversal : ");
        Preorder(a);
        System.out.println();
        System.out.print("Inorder traversal : " );
        Inorder(a);
        System.out.println();
        System.out.print("Postorder traversal : ");
        Postorder(a);
        System.out.println();
        System.out.print("Level Order taraversal : ");
        LevelOrder(a);
        System.out.println();
        System.out.print("Kth Level Element : ");
        System.out.println();
        for (int i = 0; i < Level(a); i++) {
            KtLevel(a,0, i);
            System.out.println();
        }
    }

    // display the element
    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    //size of tree
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    //Sum of the nodes
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    //product of non zero   element
    public static int Product(Node root) {
        if (root == null) {
            return 1;
        }
        return root.val * Product(root.left) * Product(root.right);
    }

    //product of zero with zero element
    public static int ZeroProduct(Node root) {
        if (root == null) {
            return 1;
        }
        return root.val * ZeroProduct(root.left) * ZeroProduct(root.right);
    }

    //Maximum of a binary tree
    public static int Max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(Max(root.left), Max(root.right)));
    }

    public static int Min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val, Math.min(Min(root.left), Min(root.right)));
    }
    //Level of a Binary tree
    public static int Level(Node root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(Level(root.right) ,Level(root.left));
    }
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.val + " ");
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val + " ");
    }
    //Level order traversal
    public static void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val + " ");
            if(front.left != null) {
                q.add(front.left);
            }
            if(front.right != null){
                q.add(front.right);
            }
        }
    }
    //Kth level traversal
    public static void KtLevel(Node root , int level , int k){
        if(root == null){
            return ;
        }
        if(level == k){
            System.out.print(root.val + " ");
        }
        KtLevel(root.left , level + 1 , k);
        KtLevel(root.right , level + 1 , k);
    }
    //Kth level traversal
    public static void KtLevelWise(Node root , int level , int k){
        if(root == null){
            return ;
        }
        if(level == k){
            System.out.print(root.val + " ");
        }
        KtLevel(root.left , level + 1 , k);
        KtLevel(root.right , level + 1 , k);
    }
}
