package LinkedListPart1;
class Linkedlist{
Node head;
Node tail;
void addAtHead(int val){
    Node temp = new Node(val);
    if(head == null){
        head = tail = temp;
    }else{
        temp.next = head;
        head = temp;
    }
}
//out put ke liye
void display(){
    if(head == null){
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.val+" ");
        temp = temp.next;
    }
    System.out.println();
  }
}
public class InsertAtHead {
    static void main(String[] args) {
   Linkedlist l = new Linkedlist();
        l.addAtHead(45);
        l.addAtHead(20);
        l.addAtHead(30);
        l.addAtHead(40);
        l.addAtHead(60);
        l.display();
        l.addAtHead(100);
        l.display();
    }
}
