package if_else;

import java.util.Scanner;

public class GreatestNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a :");
        int a = sc.nextInt();
        System.out.print("Enter the number b :");
        int b = sc.nextInt();
        System.out.print("Enter the number c :");
        int c = sc.nextInt();

        if(a >= b && a >= c ){
            System.out.println(a);
        }else if (b >= a && b >= c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
