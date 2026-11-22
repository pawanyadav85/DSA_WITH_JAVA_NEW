package Arrays;

public class ForEachLoop1 {
    static void main(String[] args) {
        int [] arr = {5,56,5,4,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
