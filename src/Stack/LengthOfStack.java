package Stack;

import java.util.Stack;

public class LengthOfStack {
    static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Pawan");
        st.push("Yadav");
        st.push("Vijay");
        st.push("Ashish");
        System.out.println(st.size());
    }
}
