package Arrays5;

public class Shallow {
    static void main(String[] args) {
        int [] arr = {5,6,7,8,9,19,23};
        int[] x = arr;
         x[0] = 100; //copy of reference not actual data
        System.out.println(arr[0]);
    }
}
