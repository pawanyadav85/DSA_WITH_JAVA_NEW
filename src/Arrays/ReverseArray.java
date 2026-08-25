package Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8,9};
        int n = arr.length;
        int i = 0 ,j = n-1;
        while(i<j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;
        }
        for ( i = 0; i < n; i++) {
//        for( int y : arr ) {
            System.out.print( arr + " ");
        }
    }
}
