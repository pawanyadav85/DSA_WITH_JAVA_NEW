package ArrayList1D;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayBuiltin {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(4);
        arr.add(7);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
