package Queuesssss;

import java.util.LinkedList;
import java.util.Queue;

public class PeekEle {
    public static void dispaly(Queue<Integer> q ){
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        dispaly(q);
        peekAt( q , 3 );
    }
    private static void peekAt(Queue<Integer> q, int idx) {
        int n = q.size();
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        System.out.println(q.peek());
        for (int i = 0; i < n - idx ; i++) {
            q.add(q.remove());
        }
    }
}
