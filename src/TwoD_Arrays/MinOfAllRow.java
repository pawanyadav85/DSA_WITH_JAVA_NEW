package TwoD_Arrays;

public class MinOfAllRow {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4,} , {2,4,5,6}, {6,7,8,9}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
            if(max < min) {
                min = max;
                System.out.println();
            }
        }
        System.out.println(min);
    }
}
