package Arrays5;

import java.util.Arrays;

public class DeepCopy {
    static void main(String[] args) {
        int [] arr = {3,4,5,6,6,7,8};
        //deep copy
        int[] x = Arrays.copyOf(arr,arr.length);
        x[5] = 100;
        System.out.println(arr[5]);
        System.out.println(x[5]);
    }
}
