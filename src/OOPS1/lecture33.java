package OOPS1;

public class lecture33 {
    public static int sum(int a , int b){
        int x = a + b;
        return x;
    }
    public static int sum(int a , int b , int c ){
        int y = a + b + c;
        return y;
    }
    public static int sum(int a , int b , int c , int d){
        int z = a + b + c + d;
        return z;
    }
    static void main(){
        System.out.println("Welcome to vararg tutorial");
        System.out.println("sum is " + sum(2 , 6));
        System.out.println("sum is " + sum(2 ,3, 4));
        System.out.println("sum is " + sum(2 , 6 , 4,5));
    }
}
