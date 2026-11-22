package ExceptionHandling;




import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideAndSumm {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = 0 ;
        int b = 0;
        try {
             System.out.println("Enter the first Number");
             a = sc.nextInt();
            System.out.println("Enter the Second Number");
             b = sc.nextInt();
            int c = a / b;
            System.out.println("Divisible number is : " + c);
        }catch(InputMismatchException ex){
            System.out.println("Please Enter Digit Only");
            System.exit(0);
        }catch(ArithmeticException ex){
            System.out.println("Donominator must not be zero");
        }
        int  d = a + b;
        System.out.println("Sum is " + d);
    }
}
