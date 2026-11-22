package Revision.revision6;

public class BubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.println(ele + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 5, 6};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = i; j < n; j++) {
                if(arr[j] < min){
                    min = arr[i];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        print(arr);
    }
}
