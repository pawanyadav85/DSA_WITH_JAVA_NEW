package Loops;

import java.util.Scanner;

public class SumAndReverse {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int sum = 0 ;
            int rev = 0;
            while (n != 0){
                sum += n % 10;
                rev *= 10;
                rev += n%10;
                n /= 10 ;
            }
            System.out.println("Sum of Number is : "+ sum);
            System.out.println("Reverse of numbers is : "+ rev);
        }
    }
