package Arrays;

import java.util.Scanner;

public class InputArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
//input
        for (int i = 0; i < n ; i++) {
        arr[i] = sc.nextInt();
        }
        //output
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
