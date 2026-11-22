package ExceptionHandling;

import java.util.Scanner;

public class UsingGetMehtod {
    static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt((args[1]));
            int c = a / b;
            System.out.println("Divisible Number is :" + c);
        }catch (Exception ex){
            System.out.println("Some Problem occured" + ex.getMessage());
        }
    }
}
