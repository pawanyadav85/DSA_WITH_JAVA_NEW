package BinarySearch;

public class Sqrt {
    static void main(String[] args) {
        int n = 5;
        int lo = 0 , hi = n;

        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(mid * mid == n){
                System.out.println(mid);
            }else if(mid * mid > n){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        System.out.println(hi);
    }
}

