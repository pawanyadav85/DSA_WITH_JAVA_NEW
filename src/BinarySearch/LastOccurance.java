package BinarySearch;

public class LastOccurance {
    static void main(String[] args) {
        int[] arr = {1,2,4,5,6,6,6,6,6,7,7,7,8,9};
        int n = arr.length;
        int target = 7;
        int idx = - 1;
        int lo = 0 , hi = n - 1;
        while(lo <= hi ){
            int mid = (lo + hi) / 2;
            if(arr[mid] == target){
                idx = mid;
                lo = mid + 1;
            }else if(arr[mid] > target){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        System.out.println(idx);
    }
}
