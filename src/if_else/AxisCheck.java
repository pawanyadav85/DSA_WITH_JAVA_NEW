package if_else;

import java.util.Scanner;

public class AxisCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x axis :");
        int x = sc.nextInt();
        System.out.print("Enter the y axis :");
        int y = sc.nextInt();

        if(x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        }else if(x < 0 && y > 0) {
            System.out.println("2st Quadrant");
        }else if(x < 0 && y < 0) {
            System.out.println("3st Quadrant");
        }else if(x > 0 && y < 0){
            System.out.println("4st Quadrant");
        }
    }
}
