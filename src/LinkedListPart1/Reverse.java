package LinkedListPart1;

public class Reverse {
    static void main(String[] args) {
        Node a = new Node(45);
        Node b = new Node(55);
        Node c = new Node(65);
        Node d = new Node(75);
        Node e = new Node(85);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        revese(a);
    }
    public static void revese(Node head){
        if(head == null){
            return;
        }
        revese(head.next);
        System.out.print(head.val+ " ");
    }
}
