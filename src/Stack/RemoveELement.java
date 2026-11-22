package Stack;

import java.util.Stack;

public class RemoveELement {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(56);
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
