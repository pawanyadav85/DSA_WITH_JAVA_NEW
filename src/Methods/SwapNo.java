package Methods;

import java.util.Scanner;

public class SwapNo {
    static void  swap(int a , int b ) {
        int tem = a;
        a = b;
        b = tem;
        System.out.println(a + " " + b);
    }
public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    System.out.println(a + " " + b);
    swap(a , b );
    }
}
