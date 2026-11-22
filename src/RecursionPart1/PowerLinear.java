package RecursionPart1;

import java.util.Scanner;

public class PowerLinear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base no:");
        int a = sc.nextInt();
        System.out.print("Enter the power:");
        int b = sc.nextInt();
        System.out.println("power : " + pow(a,b));
    }
    public static int pow(int a , int b){
        if(b == 1){
            return 1;
        }
          return  a * pow(a , b - 1);
    }
}
