package LinkedListPart1;


class ll{
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
    int length(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class SizeOfList {
    static void main(String[] args) {
        ll l = new ll();
        l.addAtHead(25);
        l.addAtHead(25);
        l.addAtHead(25);
        l.addAtHead(25);
        l.addAtHead(25);
        System.out.println("length of the List : " + l.length());
    }
}
