package if_else;

import java.util.Scanner;

public class magnitude {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        if ( n < 0 )
            n = -n ;
        if(n < 69 ){
            System.out.println("Smaller digit  then 69 ");
        }else {
                System.out.println("Not Smaller Number then 69");
        }
    }
}
