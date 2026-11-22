package Arrays5;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr = {4,5,6,6,7};
        int n = arr.length;
        int i = 0, j = n - 1;
        while(i < j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i ++;
            j --;
        }
        for ( int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
