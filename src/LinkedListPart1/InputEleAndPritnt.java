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
<<<<<<< HEAD
       System.out.println(c.val);
=======
>>>>>>> 82128e0d6c2d2887fcdc22f74a717a69f6668d3f
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(a.val);
        System.out.println(b.next.next.next.val);
    }

    public static class InputFromUser {
        static void main(String[] args) {
<<<<<<< HEAD

=======
>>>>>>> 82128e0d6c2d2887fcdc22f74a717a69f6668d3f
            Node a = new Node(50);
        }
    }
}

