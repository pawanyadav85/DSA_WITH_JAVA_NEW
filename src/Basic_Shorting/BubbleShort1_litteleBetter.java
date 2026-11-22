package Basic_Shorting;

public class BubbleShort1_litteleBetter {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [] arr = {3,4,6,7,8,2};
        int n = arr.length;

        for (int i = 0; i < n- 1 ; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
