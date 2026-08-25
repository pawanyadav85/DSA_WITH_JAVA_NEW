package if_else;

import java.util.Scanner;

public class LeastNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Value A:");
        int a = sc.nextInt();
        System.out.print("Enter the Value B:");
        int b = sc.nextInt();
        System.out.print("Enter the Value C:");
        int c = sc.nextInt();

        if( a <= b ){
            if(a <= c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
             if (b <= c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
