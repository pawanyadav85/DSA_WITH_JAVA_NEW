package Loops;

import java.util.Scanner;

public class sumdigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            n = - n;
        }
        int sum = 0 ;
        while(n != 0){
            sum += n % 10; // get last digit
            n /= 10;        // remove last digit
        }
        System.out.println(sum);
    }
}
