package QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class AddAtSpecificPostion {
    public static void display(Queue<Integer> q){
        for (int i = 0; i < q.size(); i++) {
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
        display(q);
        AddAt(q, 3, 100);
        display(q);
    }
    public static void AddAt(Queue<Integer> q  , int idx , int value){
        int n = q.size();
        if(idx < 0 || idx > n){
            System.out.println("Invalid index");
            return ;
        }
        if(idx < n){
             for (int i = 0; i < idx; i++) {
                 q.add(q.remove());
           }
        }
        q.add(value);
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }
}
