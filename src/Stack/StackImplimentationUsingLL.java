package Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyStack {
    Node head;
    int len;

    // Peek: top element
    int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }

    // Pop: remove top element
    int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int x = head.val;
        head = head.next;
        len--;
        return x;
    }

    // Push: add element at top
    void push(int ele) {
        Node temp = new Node(ele);
        if(len == 0 ){
            head = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        len ++;
    }

    // Size
    int size() {
        return len;
    }

    // Display
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackImplimentationUsingLL {
    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
        st.pop();
        st.display();
        System.out.println("Top: " + st.peek());
        System.out.println("Size: " + st.size());

        System.out.println("Popped: " + st.pop());

        System.out.println("Top: " + st.peek());
        System.out.println("Size: " + st.size());
    }
}
