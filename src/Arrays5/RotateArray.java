package Arrays5;

public class RotateArray {
    static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        int n = arr.length;
        int d = 4;
        reverse(arr , 0 , n - d);
        reverse(arr , d , n - 1);
        reverse(arr , 0 , n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverse( int[] arr , int i , int j) {
        while(i < j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;
        }
    }
}

