package Stack;

import java.util.Stack;

public class PeakElement {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(45);
        st.push(40);
        st.push(49);
        st.push(89);

        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        Integer s = st.pop();
    }
}
