package if_else;

import java.util.Scanner;

public class LeastNo {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value a:");
        int a = sc.nextInt();
        System.out.print("Enter the value a:");
        int b = sc.nextInt();
        System.out.print("Enter the value a:");
        int c = sc.nextInt();

        if( a <= b && a < c){
            System.out.println(a);
        }else if( b <= c && b <= a){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
