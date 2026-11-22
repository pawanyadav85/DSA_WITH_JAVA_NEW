package Loops;

import java.util.Scanner;

public class CompositeNo {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

// 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20 …
        System.out.print("Eneter the Number : ");
        int n = sc.nextInt();
        for (int i = 2; i < n - 1; i ++) {
            if(n % i == 0){
                System.out.println("Composite Number ");
                break;
            }
        }
    }
}
