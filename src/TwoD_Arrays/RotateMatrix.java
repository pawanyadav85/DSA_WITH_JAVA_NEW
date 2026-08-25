package TwoD_Arrays;

public class RotateMatrix {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{3,4,5,6},{4,9,7,4},{8,4,9,8}};

        // transpose matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
