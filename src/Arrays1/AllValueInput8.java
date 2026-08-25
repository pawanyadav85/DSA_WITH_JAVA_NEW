package Arrays1;

import java.util.Scanner;

public class AllValueInput8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length:");
        int length = sc.nextInt();
        int [] arr = new int[length];

        //input
        System.out.print("Enter the element:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        //output
        System.out.print("Element are :");
        for (int i = 0; i < length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}
