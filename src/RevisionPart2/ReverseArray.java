package RevisionPart2;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr = {3,5,6,3,2};
        int n = arr.length - 1 ;
        Rev(arr, n );

    }
    public static void Rev(int[] arr , int idx){
        if(idx < 0){
            return ;
        }
        System.out.print(arr[idx] + " ");
        Rev(arr, idx - 1);
    }
}
