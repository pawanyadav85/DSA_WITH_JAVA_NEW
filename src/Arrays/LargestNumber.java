package Arrays;


public class LargestNumber {
    static void main(String[] args) {
        int[] arr = {1,34,43,35,34,57,79,795,456};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}