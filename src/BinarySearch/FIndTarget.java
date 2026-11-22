package BinarySearch;

public class FIndTarget {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
       int  target = 17;
        int low = 0 , hi = n - 1;
        while(low <= hi ){
            int mid = (low + hi) / 2;
            if(arr[mid] == target){
                System.out.println(arr[mid] + " " + mid);
            break;
            }else if (arr[mid] > target){
                hi = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println("Not found ");
    }
}
