package LinkedListPart04;


class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;
// Insert at tail
    void AddAtHead(int val){
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
    // add the element
    void addAtTail(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    //Insert in specific position
    void insetAnyPos(int idx ,int val){
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index");
            return ;
        }
        if(idx == 0){
            AddAtHead(val);
        }
        if(idx == size){
            addAtTail(val);
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx  - 1; i++) {
            temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.next.prev = newNode;

        size ++;
    }
    // delete in specific position
    void deleteAtSpecificPos(int idx){
        if(idx < 0 || idx >= size ){
            System.out.println("Invalid index ");
        }
        if(idx == 0){
           AddAtHead(head.val);
        }
        if(idx == size - 1){
            addAtTail(tail.val);
        }
        Node temp = head;
        for(int i = 0 ; i < idx  ;  i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }
    //Display the result
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size:"+size);
    }
}
public class InsertInSpecificPosition {
    static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addAtTail(40);


        System.out.print("Linked List is : ");
        l.display();

        System.out.print("After insert in any position :");
        l.insetAnyPos(3,100);
        l.display();

        System.out.print("After deletion of the of node :");
        l.deleteAtSpecificPos(3);
        l.display();
    }
}
