package if_else;

import java.util.Scanner;

public class integerOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        double n = sc.nextDouble();
        int x = (int) n;
        if( n - x == 0){
            System.out.println("Isintieger");
        }else{
            System.out.println("Not integer");
        }
    }
}
