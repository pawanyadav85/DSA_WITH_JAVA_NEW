package LinkedListPart1;
class Linkedlist1{
    Node head;
    Node tail;
    int size;

    // add at head
    void addAtHead(int val){
        Node temp = new Node(val);
       if(head == null){
           head = tail = temp;
       }else{
           temp.next = head;
           head = temp;
       }
       size++;
    }
    // Add at Tail
    void addAtTail(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
             tail.next = temp;
             tail = temp;
        }
        size++;
    }
    // Insert at any position
     void insert(int val, int idx) {
        if(idx < 0 || idx > size){
            System.out.println("Invalid index");
        }else if(idx == 0){
            addAtHead(val); // call
        }else if(idx == size){
           addAtTail(val);
        }else{
            Node temp = head;
            // idx se ek position pehle jaana hai
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size ++;
        }
    }
    //out the result
    void dispaly(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class InsertAtAnyPosition {
    static void main(String[] args) {
        Linkedlist1 l = new Linkedlist1();
        l.addAtHead(30);
        l.addAtHead(40);
        l.addAtHead(50);
        l.addAtHead(60);
        l.addAtHead(70);
        l.dispaly();
        l.insert(100,3);
        l.dispaly();
    }
}
