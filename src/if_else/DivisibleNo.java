package if_else;

import java.util.Scanner;

public class DivisibleNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if(n % 3 ==0 || n % 5 ==0) {
            System.out.println("Divisible by 3 or 5 ");
        }else{
            System.out.println("Not divisible not 3 or 5");
        }
    }
}
