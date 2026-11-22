package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseTheStackUsingArrayList {
    static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        while(st.size() > 0){
            ans.add(st.pop());
        }
        for (int i = 0; i < ans.size(); i++) {
            st.push(ans.get(i));
        }
        System.out.println(st);
    }
}
