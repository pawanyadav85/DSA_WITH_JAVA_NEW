package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltin {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
