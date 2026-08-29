package LinkedListPart1;

public class PrintOnValueInList {
    static void main(String[] args) {
        Node a = new Node(88);
        Node b= new Node(98);
        Node c = new Node(48);
        Node d = new Node(58);
        Node e = new Node(68);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(value(a,2));
    }
    public static int value(Node head , int idx ){
        for(int i = 0 ;i < idx; i++){
            head = head.next;
        }
        return head.val;
    }
}
