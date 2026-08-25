package Arrays5;

import java.util.Scanner;

public class Sum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int sum = 0 ;
        int [] arr = new int[n];
        System.out.print("Enter element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i] ;
        }
            System.out.println( "SUM = " + sum);
        }
    }

