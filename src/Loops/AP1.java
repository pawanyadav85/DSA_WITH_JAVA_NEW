package Loops;

import java.util.Scanner;

public class AP1 {
    static void main(String[] args) {
        // 2, 5 ,8 , 11
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int a = 2 , d = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}
