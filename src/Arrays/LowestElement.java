package Arrays;

public class LowestElement {
    static void main(String[] args) {
        int [] arr = {34,55,45,45,67,34,4,676,7,67};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
             min = arr[i];
            }
        }
        System.out.println(min);
    }
}
