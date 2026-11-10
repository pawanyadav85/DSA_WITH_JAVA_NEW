package ExceptionHandling;

import java.util.Scanner;

public class DivideAndSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("division is " + c);
        }catch(ArithmeticException e){
            System.out.println("Bro Please enter currect details");
        }
        int d = a + b;
        System.out.println("Sum is " + d);
    }
}
