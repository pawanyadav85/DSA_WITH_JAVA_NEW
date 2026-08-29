package LinkedListPart1;

public class PrintListUsingRec {
    static void main(String[] args) {
        Node a = new Node(30);
        Node b = new Node(40);
        Node c = new Node(50);
        Node d = new Node(60);
        Node e = new Node(70);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayRec(a);
    }
    public static void displayRec(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.val + " ");
        displayRec(head.next);
    }
}
