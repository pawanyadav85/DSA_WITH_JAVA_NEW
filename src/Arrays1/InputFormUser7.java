package Arrays1;

import java.util.Scanner;

public class InputFormUser7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [7];

        //input
        for (int i = 0; i < 7; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        //output
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
