package if_else;

import java.util.Scanner;

public class absulateValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        if( n <= 0  ){
            n = -n;
        }
        System.out.println(n);
    }
}
