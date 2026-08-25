package Arrays;

import java.util.Arrays;

public class DeepCopy {
    static void main(String[] args) {
        int [] arr = {4,5,7,78,70,45,56,63};
        int [] y = Arrays.copyOf(arr,arr.length);
        y [4] = 100;
        System.out.println(arr[4]);
        System.out.println(y[4]);
    }
}
