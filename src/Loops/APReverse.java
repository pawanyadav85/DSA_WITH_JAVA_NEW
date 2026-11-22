package Loops;

public class APReverse {
    static void main(String[] args) {
        int a = 99 , d = 4 ;
        for (int i = 99; i > 0 ; i -= 4) {
            System.out.print(a + " ");
            a -= d;
        }
    }
}
