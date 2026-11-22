package Loops;

import java.util.Scanner;

public class ReverseDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Example -> 1234  -> 4321
        int n = sc.nextInt();
        int rev = 0 ;
        while(n != 0 ){
             rev *= 10;
            rev += (n % 10);
            n /= 10;
        }
        System.out.println(rev);
    }
}
