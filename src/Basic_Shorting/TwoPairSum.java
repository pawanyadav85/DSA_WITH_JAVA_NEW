package Basic_Shorting;
import java .util.*;
public class TwoPairSum {
    static void main(String[] args) {
        int[] arr = {4,5,4,3};
        Arrays.sort(arr);
        int target = 25;
        int n = arr.length;
        int i = 0 , j = n - 1;
        while(i < j ){
            if(arr[i] + arr[j] == target ){
                System.out.println("mil gaya");
            }else if (arr[i] + arr[j] > target){
                j--;
            }else if(arr[i] + arr[j] < target){
                i++;
            } else{
                System.out.println("Nhi mila");
            }
        }
    }
}
