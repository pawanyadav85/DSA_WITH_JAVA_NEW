package LinkedListPart1;

import java.util.Scanner;

public class InuptFromUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(sc.nextInt());
        Node b = new Node(sc.nextInt());
        Node c = new Node(sc.nextInt());
        Node d = new Node(sc.nextInt());
        Node e = new Node(sc.nextInt());
        //connect the node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
