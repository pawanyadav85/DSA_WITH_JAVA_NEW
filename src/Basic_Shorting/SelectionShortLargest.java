package Basic_Shorting;

public class SelectionShortLargest {
    static void main(String[] args) {
        int[] arr = {4,5,3,2,1,5,8};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            int idx = 1;
            for (int j = i; j < n ; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
