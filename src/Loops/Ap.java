package Loops;

import java.util.Scanner;

public class Ap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2, 5 ,8 , 11
        int n = sc.nextInt();
        for (int i = 2; i <= (3 * n - 1); i += 3) {
            System.out.print(i + " ");
        }
    }
}
