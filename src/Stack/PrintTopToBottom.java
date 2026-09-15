package Stack;

import java.util.Stack;

public class PrintTopToBottom {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); // bottom
        st.push(20);
        st.push(30);
        st.push(40);  // top
        while(st.size() > 0){
            System.out.println(st.pop());
        }
    }
}
