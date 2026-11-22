package LinkedListPart1;


public class PrintAllValue {

    static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(400);
        Node d = new Node(600);
        Node e = new Node(34);
        Node f = new Node(250);
        //connect the node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
    }
    public static void display(Node head){
        System.out.print(head.val + " ");
        System.out.print(head.next.val + " ");
        System.out.print(head.next.next.val + " ");
        System.out.print(head.next.next.next.val + " ");
        System.out.print(head.next.next.next.next.val + " ");
        System.out.print(head.next.next.next.next.next.val + " ");
    }
}
