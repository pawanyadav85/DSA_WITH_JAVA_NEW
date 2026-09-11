package LinkedListPart02;
class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }

}
class DLL{
    Node head;
    Node tail;
    int size;

    void InsetAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size ++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }
}
public class AddAtHead {
    static void main(String[] args) {
        DLL d = new DLL();
        d.InsetAtHead(20);
        d.InsetAtHead(30);
        d.InsetAtHead(40);
        d.display();
    }
}
