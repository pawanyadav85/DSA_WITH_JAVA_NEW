package RecursionPart1;

import java.util.Scanner;

public class GlobalVariable1 {
    static int n ;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        pawan(1);
    }
    public static void pawan(int x  ){
        if(x > n){                        //
            return ;
        }
        System.out.println(x);
        pawan(x + 1);
    }
}
