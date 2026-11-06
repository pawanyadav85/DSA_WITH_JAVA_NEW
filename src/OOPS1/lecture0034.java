package OOPS1;

import java.util.Scanner;

public class lecture0034 {
public static int Fib(int n ){
    if(n == 0 || n == 1){
        return n;
    }
    return Fib(n - 1) + Fib(n - 2);
}
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(Fib(i) + " ");
        }
    }
}
