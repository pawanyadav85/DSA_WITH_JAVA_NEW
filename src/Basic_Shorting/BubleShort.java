package Basic_Shorting;

public class BubleShort {

    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {4,5,6,7,8,3,2};
        int n = arr.length;
       // print(arr);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            }
        }
        print(arr);
    }
}
