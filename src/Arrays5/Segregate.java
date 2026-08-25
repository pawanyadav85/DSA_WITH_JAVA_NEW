package Arrays5;

public class Segregate {
    static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 1};
int NoOfZero = 0;
int NoOfOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                NoOfZero ++ ;
                NoOfOne ++ ;
            }
        }
        for (int i = 0; i < NoOfOne; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < NoOfOne; i++) {
             arr[i] = 1;
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}