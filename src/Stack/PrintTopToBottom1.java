package Stack;

import java.util.Stack;

public class PrintTopToBottom1 {
    static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println("Original stack is : "+st1);

        System.out.println("Top to bottom element is :");
        while(st1.size() > 0){
            int top = st1.pop();
            System.out.println(top);
            st2.push(top);
        }
        while(st2.size() > 0){
            st1.push(st2.pop());
        }
    }
}
