package QueueExample.ArrayImlimentation;
class CircularQueue{
    int[] arr ;
    int f ;
    int r;
    int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }
    // remove element in the array using queue
    int remove(){
        if(size == 0){
            System.out.println("Array are empty");
            return-1;
        }
        int front = arr[f];
        f++;
        if(f == arr.length){
            f = 0;
        }
        size--;
        return front;
    }
    // add the element in the  array using queue
    void add(int val){
        if(size == arr.length){
            System.out.println("queue is full ");
            return;
        }
        arr[r] = val;
        r++;
        if(r== arr.length){
            r = 0;
        }
        size ++;
    }
    int peek(){
        if(size == 0){
            System.out.println("array is empty");
            return - 1;
        }
        return arr[f];
    }
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int index = f;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[index] + " ");

            index++;

            if (index == arr.length) {
                index = 0;
            }
        }
        System.out.println();
    }
}
public class Imlimentation {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(100);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.display();

        q.remove();

        q.display();

        q.add(300);

        q.display();

        System.out.println("Peek: " + q.peek());

        q.display();
    }
}
