package ArrayList2D;

import java.util.ArrayList;

public class printMatrix {
    static void main(String[] args) {
                ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

                // first row
                ArrayList<Integer> row1 = new ArrayList<>();
                row1.add(1) ; row1.add(4); row1.add(2);
                arr.add(row1);

                // second row
                ArrayList<Integer> row2 = new ArrayList<>();
                row2.add(1) ; row2.add(4); row2.add(2);
                arr.add(row2);

                // third row
                ArrayList<Integer> row3 = new ArrayList<>();
                row3.add(1) ; row3.add(4); row3.add(2);
                arr.add(row3);

        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();

        }

            }
        }
