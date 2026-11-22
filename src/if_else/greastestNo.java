package if_else;

import java.util.Scanner;

public class greastestNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a :");
        int a = sc.nextInt();
        System.out.print("Enter the value b :");
        int b = sc.nextInt();
        System.out.print("Enter the value c :");
        int c = sc.nextInt();

        if (a >= b) {
            if (b >= c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b >= c)
                System.out.println(b);
        else
        System.out.println(c);
    }
    }
}