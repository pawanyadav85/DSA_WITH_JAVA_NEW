package ArrayList1D;

import java.util.ArrayList;

public class RemoveElement {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        int n = arr.size();
        arr.add(7);
        arr.add(5);
        arr.add(8);
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        arr.remove(arr.size ()- 1);
        System.out.println(arr);
    }
}
