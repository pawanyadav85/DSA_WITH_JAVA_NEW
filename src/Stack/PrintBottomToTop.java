package Stack;

import java.util.Stack;

public class PrintBottomToTop {
    static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println("Original stack"+st1);

        while(st1.size() > 0){
            st2.push(st1.pop());

        }
        System.out.println("empty s1 stack"+st1);

        System.out.println("Bottom to top element");
        while(st2.size() > 0){
            int bottom = st2.pop();
            System.out.println(bottom);
            st1.push(bottom); // orginal stack move
        }
        System.out.println("Stack after printin:" + st1);
    }
}
