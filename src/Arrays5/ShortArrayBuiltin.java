package Arrays5;
import java .util.Arrays;
public class ShortArrayBuiltin {
    static void main(String[] args) {
        int [] arr = {4,5,6,6,7,8,-3};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    static void print(int [] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print (x[i] + "  ");
        }
        System.out.println();
    }
}
