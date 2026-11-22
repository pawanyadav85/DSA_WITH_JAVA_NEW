package QueueExample.QueueImUsingLinkedList;

class Node{
    int val;
    Node next;
    Node(int val ){
        this.val = val;
    }
}

class MyQueue{
    Node head;
    Node tail;
    int size;

    //peek the head of linked list
    int peekEle(){
        if(size == 0){
            System.out.println("Queue is empty");
            return - 1;
        }
        return head.val;
    }
// Remove the element
    int  remove(){
        Node temp = head;
        if(size == 0){
            System.out.println("Empty the queue");
return -1;
        }
        int fornt = head.val;
            head = head.next;
        size --;
        return fornt;
    }

// add the element
    void add(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }else {
            tail.next = temp;
            tail = temp;
        }
        size ++;
    }
    void dispaly(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListImp {

    static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.dispaly();
        q.add(60);
         q.dispaly();
        System.out.println(q.remove());

        System.out.println(q.peekEle());
         q.dispaly();
    }
}
