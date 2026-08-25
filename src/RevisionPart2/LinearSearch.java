package RevisionPart2;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {4,5,6,74,3,2};
        int target = 74;
        exist( arr,target, 0 );
    }
    public static boolean exist(int[] arr , int target , int idx){
        if(idx == arr.length){
            return false;
        }
        if(arr[idx] == target){
            return true;
        }else{
            return exist(arr, target , idx + 1);
        }
    }
}
