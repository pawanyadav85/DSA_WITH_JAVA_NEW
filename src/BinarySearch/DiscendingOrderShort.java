package BinarySearch;

public class DiscendingOrderShort {
    static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3};
        int n = arr.length;
        int lo = 0 , hi = n - 1;
        int target  = 3 ;
        boolean flag = false;
        while(lo <= hi){
            int mid = (lo +  hi) / 2;
            if(arr[mid] == target){
                System.out.println(mid);
                flag = true;
                break;
            }else if(arr[mid] > target){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }if(!flag){
            System.out.println("Not found");
        }
    }
}
