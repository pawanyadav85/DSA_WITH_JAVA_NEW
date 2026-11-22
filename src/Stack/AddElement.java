package Stack;

import java.util.Stack;

public class AddElement {
    static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(40);
        st1.push(30);
        st1.push(20);
        st1.push(10);
        System.out.println("Before add the element : " + st1);
        int idx = 2;
        while(st1.size() > idx){
            st2.push(st1.pop());
        }

        st1.push(100);
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
        System.out.println("After add the Element :"+st1);
    }
}
