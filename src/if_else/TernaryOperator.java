package if_else;

import java.util.Scanner;

public class TernaryOperator {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();

        System.out.println( (n % 2 == 0 ) ? "Even" : "Odd");
    }
}
