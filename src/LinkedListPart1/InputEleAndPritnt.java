package LinkedListPart1;


public class InputEleAndPritnt {
    static void main(String[] args) {
        Node a = new Node(60);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(a.val);
        System.out.println(b.next.next.next.val);
    }

    public static class InputFromUser {
        static void main(String[] args) {
            Node a = new Node(50);
        }
    }
}

