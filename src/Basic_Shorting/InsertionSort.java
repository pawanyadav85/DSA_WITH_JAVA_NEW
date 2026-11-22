package Basic_Shorting;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr = {3,4,5,6,7,2,1};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
        while(j > 0 && arr[j] < arr[j - 1]){
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
}
