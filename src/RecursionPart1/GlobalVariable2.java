package RecursionPart1;

import java.util.Scanner;

public class GlobalVariable2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        pawan(n);
    }
    public static void pawan(int n){
        if(n == 0){                 // Base case
            return;
        }
        System.out.println(n);           //Work
        pawan(n - 1);               // Call
        System.out.println(n);
    }
}
