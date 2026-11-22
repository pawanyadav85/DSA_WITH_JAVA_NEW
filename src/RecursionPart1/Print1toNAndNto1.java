package RecursionPart1;

import java.util.Scanner;

public class Print1toNAndNto1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pawan(n);
    }
    public static void pawan(int n){
        if(n <= 0){
            return;
        }
        System.out.println( n);

        pawan(n-1);
        System.out.println(n);
    }
}
