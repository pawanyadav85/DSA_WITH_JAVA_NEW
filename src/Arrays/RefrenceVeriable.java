package Arrays;

public class RefrenceVeriable {
    static void main(String[] args) {
        int [] x = {7,4,7,5,3,356,56};
        System.out.println(x[4]);
        change(x);
        System.out.println(x[4]);
    }
    public static void change(int [] y) {
        y[4] = 100;
    }
}
