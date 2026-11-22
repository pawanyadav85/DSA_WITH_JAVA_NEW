package QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveEle {
    public static void display(Queue<Integer> q){
    int n = q.size();
    for (int i = 0; i < n; i++) {
        System.out.print(q.peek() + " ");
        q.add(q.remove());
    }
        System.out.println();
}
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(100);
        q.add(40);
        q.add(50);
        display(q);
        removeAt(q , 3);
        display(q);
    }
    public static void removeAt(Queue<Integer> q , int idx ){
        int n = q.size();
        for (int i = 0; i < idx ; i++) {
            q.add(q.remove());
        }
        q.remove();
        for (int i = idx - 1; i < n - 2; i++) {
            q.add(q.remove());
        }
    }
}
