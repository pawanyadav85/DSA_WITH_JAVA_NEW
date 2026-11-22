package LinkedListPart1;
class LinkedlistDel{
    Node head;
    Node tail;
    // Add the element in linked list
    void addAtList(int val){

        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }
    // delete the head element
    void DeleteAtHead(){
        if(head == null){
            System.out.println("Node are empty..");
            return;
        }
        head = head.next;
    }
    // display the head element
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class DeleteAtHead {
    static void main(String[] args) {
        LinkedlistDel d = new LinkedlistDel();
        //add nodes
        d.addAtList(50);
        d.addAtList(60);
        d.addAtList(70);
        d.addAtList(80);
        //delete karne se pahle
        System.out.println("Before Delete the element ");
        d.display();

        //delete head
        d.DeleteAtHead();
        System.out.println("After delete the element ");
        d.display();
    }
}
