package Stack;

import java.util.Stack;

public class FindElement {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        System.out.println("Original element are:"+st);
        int idx = 2;
        while(st.size() > idx + 1) {
            st1.push(st.pop());
        }
        System.out.println("Element at index " + idx + " : " + st.peek());
        while(st1.size() > 0){
            st.push(st1.pop());
        }
        System.out.println("After print orginal elemetn area:" + st);
    }
}
