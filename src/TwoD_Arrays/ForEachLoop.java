package TwoD_Arrays;

public class ForEachLoop {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {4,5,6,7}, {5,6,7,8}};
        for (int i = 0; i < arr.length; i++) {
            for (int ele : arr[i]) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
