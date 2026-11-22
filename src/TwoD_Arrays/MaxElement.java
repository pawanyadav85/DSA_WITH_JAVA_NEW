package TwoD_Arrays;

public class MaxElement {
    static void main(String[] args) {
        int[][] arr =  {{3,4,3,2,1} ,{4,5,6,7,8,9,0} , {3,1,5,7,5,8,9} };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
