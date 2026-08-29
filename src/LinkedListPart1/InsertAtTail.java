package LinkedListPart1;
class LinkedList{
    Node head;
    Node tail;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    void display(){
        if(tail == null){
            return ;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class InsertAtTail {
    static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addAtTail(20);
        l.addAtTail(30);
        l.addAtTail(40);
        l.addAtTail(50);
        l.display();
        l.addAtTail(200);
        l.display();
        l.addAtTail(500);
        l.display();
    }
}
