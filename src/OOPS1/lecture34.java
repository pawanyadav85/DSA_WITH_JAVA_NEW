package OOPS1;

import java.util.Scanner;

public class lecture34 {
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("factorial of number is : " + factorial(n));
    }
}
