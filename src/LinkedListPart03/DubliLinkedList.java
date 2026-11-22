package LinkedListPart03;
class Node {
    int val;
    Node next;
    Node prev;

     Node(int val) {
        this.val = val;
    }
}

    class DLL{
        Node head;
        Node tail;
        int size;

        // add element in the linked list
        void addElemet(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            }
            size ++;
        }
        // delete the head element
        void deleteAtHead(){
            if(size == 0){
                System.out.println("you dont have element ");
                return;
            }
            if(size == 1){
                head = tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            size --;
        }

       // delete the tail element
        void deleteAtTail(){
            if(size == 0){
                System.out.println("You dont have an element");
                return ;
            }
            if(size == 1){
                head = tail =  null;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
            size --;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
            System.out.println("Size of linked list :"+size);
        }
        //Reverse the linked list
        void reverse(){
            Node temp = tail;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.prev;
            }
            System.out.println();
            System.out.println("Size of linked list : "+size);
        }
    }
public class DubliLinkedList {
    static void main(String[] args) {
        DLL list = new DLL();
        list.addElemet(40);
        list.addElemet(50);
        list.addElemet(60);
        list.addElemet(70);
        list.addElemet(80);
        list.addElemet(90);
        list.addElemet(100);
        list.display();

        System.out.println("After deletion of Head:");
        list.deleteAtHead();
        list.display();

        System.out.println("After deletion of tail");
        list.deleteAtTail();
        list.display();

        System.out.println("Revese of Linked list");
        list.reverse();
    }
}
