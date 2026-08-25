package Arrays5;

public class MinValueOfArr {
    static void main(String[] args) {
        int[] arr = {4,5,6,7,3,4,6,8,9};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min = "+ min);
    }
}
