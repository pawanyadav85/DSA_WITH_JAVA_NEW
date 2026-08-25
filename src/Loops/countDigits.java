package Loops;

import java.util.Scanner;

public class countDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(n == 0 ){
            n = 1;
        }
        int count = 0;
        while( n != 0){       // jab tak zero na ho chalate raho
            n /= 10; // remove last digit (Ex = 1234 -> 123 -> 12 -> 1 -> 0)
            count ++; // jo digit remove hua use count karo
        }
        System.out.println(count);
    }
}
