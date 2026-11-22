package BinarySearch;

public class FIndIndex {
    static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8,9};
        int n = arr.length;
        int target = 7;
        boolean found = false;
        int lo = 0 , hi = n - 1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] == target){
                System.out.println(mid);
                found = true;
                break;
            }else if(arr[mid] > target){
                hi = mid - 1;
            }else{
                lo = mid + 1;

            }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}
