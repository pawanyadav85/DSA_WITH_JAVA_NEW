package Basic;

import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the price:");
        double p = sc.nextDouble();
        System.out.print("Enter the rate :");
        double r = sc.nextDouble();
        System.out.print("Enter the time :");
        double t = sc.nextDouble();
        double si = p * r * t / 100;
        System.out.println(si);

    }
}
