package LinkedListPart1;
class LinkedList3{
    Node head;
    Node tail;
    int size ;
    //add element
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size ++;
    }
    // delete the node
    void delete(int idx ){

        if(idx < 0 || idx >= size){
            System.out.println("Invlid index");
            return;
        }
        if(idx == 0){
            head = head.next;
            size --;
            if(size == 0){
                tail = null;
            }
            return ;
        }
        Node temp = head;
        for(int i = 0 ; i < idx - 1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size - 1){
            tail = temp;
        }
        size--;
    }
    // display the result
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class DeleteElement {
    static void main(String[] args) {
        LinkedList3 l = new LinkedList3();
        l.addAtHead(60);
        l.addAtHead(50);
        l.addAtHead(40);
        l.addAtHead(30);
        l.addAtHead(20);
        l.addAtHead(10);
        l.display();
        l.delete(4);
        l.display();
    }
}
