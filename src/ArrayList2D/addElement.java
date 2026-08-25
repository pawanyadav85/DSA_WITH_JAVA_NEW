package ArrayList2D;

import java.util.ArrayList;

public class addElement {
    static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(); // store the value of all array list
          
        //Row first
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        //Row second
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        //Row first
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);

        arr.add(row1);
        arr.add(row2);
        arr.add(row3);

        System.out.println(arr.get(0).get(2));
        System.out.println(arr);
    }
}
