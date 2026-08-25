package Arrays;

import java.util.Scanner;

public class PrintNegativeNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of element:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //input
        System.out.print("Enter the element:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
       //output
        for (int i = 0; i < n; i++) {
            //negative
            if(arr[i] < 0) {
                System.out.print(arr[i] + " ");
                }
            }
        }
    }

