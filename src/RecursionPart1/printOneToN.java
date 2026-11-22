package RecursionPart1;

import java.util.Scanner;

public class printOneToN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        pawan(1, n);
    }
    public static void pawan( int x , int n){
        if(x > n){
            return ;
        }
        System.out.println(x);
        pawan(x + 1 , n);
    }
}
