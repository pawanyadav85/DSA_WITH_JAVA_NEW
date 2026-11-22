package Basic_Shorting;

public class CheckShortOrNot {
    static void main(String[] args) {
        int[] arr = {1,3,4,5,9,7,8};
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                System.out.println("Array Not Shorted");
            }
        }
        System.out.println("Array Shorted");
    }
}
