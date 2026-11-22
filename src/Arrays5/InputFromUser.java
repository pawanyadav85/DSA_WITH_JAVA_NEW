package Arrays5;

import java.util.Scanner;

public class InputFromUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         //input size
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

          //input element value
        System.out.print("Enter the Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
