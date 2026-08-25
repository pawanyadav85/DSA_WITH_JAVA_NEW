package RevisionPart2;

public class RecursionOnArray {
    static void main(String[] args) {
        int[] arr = {4,3,2,2,1,6,7};
        recPrint(arr,0);
    }
    public static void recPrint(int [] arr , int idx  ){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        recPrint(arr, idx + 1);
    }
}
