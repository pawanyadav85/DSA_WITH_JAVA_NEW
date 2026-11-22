package if_else;

import java.util.Scanner;

public class AbsulateValue1 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Value :");
        int n = sc.nextInt();
        if (n >= 0){
            System.out.println(n);
        }else{
            System.out.println(-n);
        }
    }
}
