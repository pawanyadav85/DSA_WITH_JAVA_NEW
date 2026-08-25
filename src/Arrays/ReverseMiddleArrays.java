package Arrays;

public class ReverseMiddleArrays {
    static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,8,9};
        int n = arr.length;
        int i = 2 , j = 5;
        while(i<j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;
        }
        for( int each : arr){
            System.out.print( each +" ");
        }
    }
}
