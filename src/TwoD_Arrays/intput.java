package TwoD_Arrays;

public class intput {
    static void main(String[] args) {
        int [][] arr = {{6,5,4,3} , {6,4,3,2,6} , {5,0,9,7,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                System.out.print(arr[i] [j] + " ");
            }
            System.out.println();
        }
    }
}
