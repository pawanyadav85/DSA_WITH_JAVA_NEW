package Arrays;

public class MinmumElementOfArray {
    static void main(String[] args) {
        int [] arr = {45,56,67,45,3,5,67,6832,5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
