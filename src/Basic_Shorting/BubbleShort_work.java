package Basic_Shorting;


public class BubbleShort_work {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele +  " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {4,5,6,3,2,6,7};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1 ] = temp;
            }
        }
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1 ] = temp;
            }
        }
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1 ] = temp;
            }
        }
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1 ] = temp;
            }
        }
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1 ] = temp;
            }
        }
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1 ] = temp;
            }
        }
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1 ] = temp;
            }
        }
        print(arr);
    }
}
