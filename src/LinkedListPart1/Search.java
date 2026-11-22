package LinkedListPart1;
class Element{
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
   boolean search(int value){
    if(head == null){
      return false ;
    }
    Node temp = head;
    while(temp != null){
     if(temp.val == value){
       return true;
     }
      temp = temp.next;
  }
    return false;
  }
}
public class Search {
    static void main(String[] args) {
    Element e = new Element();
      e.addAtHead(24);
      e.addAtHead(20);
      e.addAtHead(45);
      e.addAtHead(50);
      e.addAtHead(24);
      System.out.println(e.search(45));
      System.out.println(e.search(5));
    }
}
