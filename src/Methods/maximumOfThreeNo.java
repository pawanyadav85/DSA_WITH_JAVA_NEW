package Methods;

public class maximumOfThreeNo {
    static void max(int a , int b , int c) {
        if(a >= b && a >= c ){
            System.out.println(a);
        }else if(b >= c && b >= a ){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    static void main(String[] args) {
        max(9, 9 , 9);
    }
}
