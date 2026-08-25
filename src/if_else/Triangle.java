package if_else;

import java.util.Scanner;

public class Triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side 1 :");
        int side1 = sc.nextInt();
        System.out.print("Enter the Side 2 :");
        int side2 = sc.nextInt();
        System.out.print("Enter the Side 3 :");
        int side3 = sc.nextInt();
        if( side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side1 + side2)){
            System.out.println(" Valid Tringle");
        }else{
            System.out.println("NOt valid Triangle");
        }
    }
}
