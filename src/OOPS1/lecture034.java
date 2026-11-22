package OOPS1;

import java.util.Scanner;

public class lecture034 {
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    public static int Fact(int n ){
        int product = 1;
        if(n == 0 || n == 1){
            return 1;
        }else{
            for (int i = 1; i <=n ; i++) {
                product *= i;
            }
        }
        return product;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("factorial of number is : " + factorial(n));
        System.out.println("factorial of number is : " + Fact(n));
    }
}
