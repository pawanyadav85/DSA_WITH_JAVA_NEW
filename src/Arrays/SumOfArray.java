package Arrays;

public class SumOfArray {
    static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}
