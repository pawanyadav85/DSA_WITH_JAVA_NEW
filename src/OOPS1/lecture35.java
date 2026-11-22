package OOPS1;


import java.util.Scanner;

public class lecture35 {
    //problem number 1
    public static int Table(int n ){
        int x = 1;
        for (int i = 1; i <= 10; i++) {
             x = n * i;
            System.out.println(x);
        }
        return x;
    }
    //problem number 2
    public static void pattern1(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    //Problem Number 3
    public static int NaturalSum(int n ){
        if(n == 1){
            return 1;
        }
        return n + NaturalSum(n -1);
    }
    //Problem number 4
    public static void Pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Problem no 5
    public static int Fib(int n){
        if(n == 1){
            return 0;
        }else if(n == 2){
            return 1;
        }else{
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    //find the average of the Problem 6

    public static double Avg(double ... arr){
        int count = 0;
         double sum = 0;
        for(double x : arr){
            sum += x;
            count ++;
        }
        return  sum / count;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
//        int x = Table(5);
//        pattern1(n);
//
//        System.out.println("First sum "+ NaturalSum(n));
//
//        Pattern2(n);

//        int f = Fib(n);
//        System.out.println(f);

        System.out.println(Avg(4,5));
        System.out.println(Avg(4,5,8));
        System.out.println(Avg(4,5,7,8));
        System.out.println(Avg(4,5,8,6,3));
    }
}
