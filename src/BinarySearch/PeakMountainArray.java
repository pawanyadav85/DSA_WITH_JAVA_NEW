package BinarySearch;

public class PeakMountainArray {
    static void main(String[] args) {
        int[] arr = {1,2,9,8,7,6,5,4};
        int n = arr.length;
        int lo = 1 , hi = n - 2;
        while(lo <= hi){
            int mid = (lo + hi ) / 2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
                System.out.println(mid);
                break;
            }else if(arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]){
                hi = mid - 1;

            }else{
                lo = mid + 1;
            }
        }
    }
}
