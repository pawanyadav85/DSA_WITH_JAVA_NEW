package LinkedListPart02;

class Node1{
    int val;
    Node1 prev;
    Node1 next;
    Node1(int val){
        this.val = val;
    }
}
class DubliLL{
    Node1 head;
    Node1 tail;
    int size;

    void AddAtTail(int val){
        Node1 temp = new Node1(val);
        if(head == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size ++;
    }
    void disply(){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class AddAtTail {
    static void main(String[] args) {
        DubliLL d = new DubliLL();
        d.AddAtTail(20);
        d.AddAtTail(29);
        d.AddAtTail(4);
        d.AddAtTail(5);
        d.AddAtTail(6);
        d.disply();
        d.AddAtTail(5);
        d.disply();
    }
}
