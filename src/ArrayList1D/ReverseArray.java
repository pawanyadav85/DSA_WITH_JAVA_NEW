package ArrayList1D;

import java.util.ArrayList;

public class ReverseArray {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(9);

        int i = 0 , j = arr.size() - 1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i , arr.get(j));
            arr.set(j , temp);
            i++ ;
            j--;
        }
        System.out.println(arr);
    }
}
