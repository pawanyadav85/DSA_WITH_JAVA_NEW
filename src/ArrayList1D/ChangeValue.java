package ArrayList1D;

import java.util.ArrayList;

public class ChangeValue {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(9);
        System.out.println(arr.get(3));
        arr.set(3,400);
        System.out.println(arr.get(3));
    }
}
