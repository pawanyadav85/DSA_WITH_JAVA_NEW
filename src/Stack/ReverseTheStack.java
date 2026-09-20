package Stack;

import java.util.Stack;

public class ReverseTheStack {
    static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        System.out.println("Orginal stack: " + st1);
        while(st1.size() > 0){
        st2.push(st1.pop());
        }
        while(st2.size() > 0 ){
            st3.push(st2.pop());
        }
        while(st3.size() > 0){
            st1.push(st3.pop());
        }
        System.out.println("Reverse stack : " + st1);
    }
}
