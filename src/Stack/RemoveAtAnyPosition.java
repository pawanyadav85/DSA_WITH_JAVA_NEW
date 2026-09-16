package Stack;

import java.util.Stack;

public class RemoveAtAnyPosition {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(40);
        st.push(30);
        st.push(100);
        st.push(20);
        st.push(10);
        int idx = 2;
        System.out.println("Before remove the element :"+st);
        while(st.size() > idx + 1){
            st1.push(st.pop());
        }
        st.pop();
        while(st1.size() > 0){
            st.push(st1.pop());
        }
        System.out.println("After remove the element are : "+st);
    }
}