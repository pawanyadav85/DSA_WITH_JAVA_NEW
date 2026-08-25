package if_else;

import java.util.Scanner;

public class DivisibleByFive {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        if( n % 5 ==0){
            System.out.println("Divisible by five");
        }else{
            System.out.println(" Not Divisible Five ");
        }
    }
}
