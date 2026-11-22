package CyclicSort;

public class MissingArrays {
    static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7};
        int n = arr.length;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == i + 1 || arr[i] == n + 1 ){
                   i++;
            }else{
                int idx = arr[i] - 1;
                Swap(arr, i , idx);
            }
        }
        for( i = 0 ;i < arr.length ; i++){
            if(arr[i] != i + 1){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(n);
        }

    private static void Swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
