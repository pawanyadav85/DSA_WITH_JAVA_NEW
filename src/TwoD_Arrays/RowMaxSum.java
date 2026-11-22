package TwoD_Arrays;

public class RowMaxSum {
    static void main(String[] args) {
        int[][] arr = {{3,4,5,6,8} , {7,6,1,30,4} , {4,5,6,6,7} , {9,9,9,9,9}};
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0 ;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(row + " " + maxSum);
    }
}
