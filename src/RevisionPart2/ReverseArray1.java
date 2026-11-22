package RevisionPart2;

public class ReverseArray1 {
    static void main(String[] args) {
        int[]arr = {4,5,6,7,5,3};
        Rev(arr, 0);
    }
    public static void Rev(int[] arr , int idx){
        if(idx == arr.length){
            return ;
        }

        Rev(arr , idx + 1);
        System.out.print(arr[idx] + " ");
    }
}
