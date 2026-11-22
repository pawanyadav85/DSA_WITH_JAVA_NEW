package BinarySearch;

public class FistOccurance {
    static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6,6,6,6,7,7,7,7,8,8,8};
        int n = arr.length;
        int lo = 0 , hi = n - 1;
        int target = 6;
        int idx = - 1;
        while(lo <= hi){
            int mid = (lo + hi ) / 2;

            if(arr[mid] == target){
                idx = mid;
                hi = mid - 1;
            }else if (arr[mid] > target) {
                hi = mid - 1;
            }else {
                lo = mid + 1;
            }
        }
        System.out.println(idx);
    }
}
