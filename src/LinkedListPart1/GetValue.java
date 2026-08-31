package LinkedListPart1;
class LinkedList2{
    Node head;
    Node tail;
    //add at the head
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }
    //get the value of the any index;
    int get(int idx){
        Node temp = head;
        for(int i = 0 ; i < idx ; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
public class GetValue {
    static void main(String[] args) {
        LinkedList2 l = new LinkedList2();
        l.addAtHead(55);
        l.addAtHead(65);
        l.addAtHead(75);
        l.addAtHead(85);
        System.out.println(l.get(3));
    }
}
