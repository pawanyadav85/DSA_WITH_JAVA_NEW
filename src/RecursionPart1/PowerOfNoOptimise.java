package RecursionPart1;

import java.util.Scanner;

public class PowerOfNoOptimise {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base:");
        int a = sc.nextInt();
        System.out.print("Enter the power:");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
    public static int pow(int a , int b){
        if(b == 0){
            return 1;
        }
        int call = pow(a, b / 2);
        if(b % 2 == 0){
            return call * call;
        }else{
            return a * call * call;
        }
    }
}
