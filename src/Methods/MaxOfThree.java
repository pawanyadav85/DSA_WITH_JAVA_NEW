package Methods;

public class MaxOfThree {
    static int  max(int a , int b , int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c && b >= a) {
            return b;
        } else {
            return c;
        }
    }
        public static void main(String [] args){
           int x = max(4 , 5  , 6 );
            System.out.println(x);
    }
}
