package RevisionPart2;

public class BinarySearch {
    static int main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        int target = 6;
        int n = arr.length;
        return Search(arr, target, 0 , n- 1);
    }
    public static int Search(int[] arr, int target, int lo , int hi){
        if(lo > hi){
            return -1;
        }
        int mid = (lo + hi ) / 2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return  Search( arr,  target,  lo , mid - 1);
        }else{
            return  Search( arr,  target, mid + 1 ,  hi);
        }
    }
}
