package if_else;

import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cp:");
        int cp = sc.nextInt();
        System.out.print("Enter the sp:");
        int sp = sc.nextInt();
        if(sp > cp ){
            System.out.println("Profit is :" + (sp - cp));
        }else if (cp > sp){
            System.out.println("Loss is : "+ (cp - sp));
        }else{
            System.out.println("No profit No loss ");
        }
    }
}
