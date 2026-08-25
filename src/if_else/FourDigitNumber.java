package if_else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n > 999 && n < 10000){
            System.out.println("Four Digit Number ");
        }else{
            System.out.println("Not four digit Number");
        }
    }
}
