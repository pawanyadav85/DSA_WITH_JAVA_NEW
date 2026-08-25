package Arrays;

public class Max_Num_Of_Arrays {
    static void main(String[] args) {
        int [] arr = {2,3,45,6,7,56,75,68,68};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
