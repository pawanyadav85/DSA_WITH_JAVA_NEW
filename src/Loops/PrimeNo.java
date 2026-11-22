package Loops;

import java.util.Scanner;

public class PrimeNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        boolean flag = true;   // prime number
        for (int i = 2; i < n-1; i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        if(n == 1){
            System.out.println("not composite nor prime ");
        } else if (flag == false){
            System.out.println("Composite number ");
        } else {
            System.out.println("Prime number ");
        }
    }
}
