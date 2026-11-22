package BinarySearch;

public class FloorInSortedArray {
    static void main(String[] args) {
int[] arr  =  {1,2,3,4,6,8,10};
int x = 5;
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > x) {
                hi = mid - 1;
            } else if (arr[mid] <= x) {
                idx = mid;
                lo = mid + 1;
            }
        }
        System.out.println(idx);
    }
        }


