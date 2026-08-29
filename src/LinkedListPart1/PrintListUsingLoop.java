package LinkedListPart1;

public class PrintListUsingLoop {
    static void main(String[] args) {
        Node a = new Node(29);
        Node b = new Node(59);
        Node c = new Node(69);
        Node d = new Node(79);
        Node e = new Node(89);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next; // very Important
        }
    }
}
