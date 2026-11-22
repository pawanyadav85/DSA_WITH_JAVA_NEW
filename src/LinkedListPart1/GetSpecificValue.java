package LinkedListPart1;

public class GetSpecificValue {
    static void main(String[] args) {
    Node a = new Node(40);
    Node b = new Node(4);
    Node c = new Node(50);
    Node d = new Node(60);
    Node e = new Node(80);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
        System.out.println(get(a,4));
    }
    public static int  get(Node head, int idx){
        Node temp = head;
        for(int i = 0 ; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}

