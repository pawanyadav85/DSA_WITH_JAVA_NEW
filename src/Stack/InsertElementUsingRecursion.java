package Stack;

import java.util.Stack;

public class InsertElementUsingRecursion {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);  // buttom
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50); // top
        System.out.println("Original Stack : " + st );
        int idx = 100;
        pushAtBottom(st , idx );
        System.out.println("After insertion " + st);
    }

    static void pushAtBottom(Stack<Integer> st, int idx) {
        if(st.size() == 0 ){
            st.push(idx);
            return ;
        }
        int top = st.pop();
        pushAtBottom(st , idx );
        st.push(top);
    }
}
