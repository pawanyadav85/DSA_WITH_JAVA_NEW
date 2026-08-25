package ArrayList2D;

import java.util.ArrayList;

public class SpirallyOfMatrix {
    static void main(String[] args) {

    }
        public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length;    // row
        int n = arr[0].length; //column
        int frow = 0 , lrow = m - 1;
        int fcol = 0 , lcol = n - 1;
        while(frow <= lrow && fcol <= lcol) {
            for (int j = fcol; j <= lcol; j++) {     // print first row then increase row
                ans.add(arr[frow][j]);
                frow++;
                if(frow > lrow || fcol > lcol) break;
            }
            for (int i = frow; i <= lrow; i++) { // print  last col then increase column
                ans.add(arr[i][lcol]);
                lcol --;
                if(frow > lrow || fcol > lcol) break;
            }
            for (int j = lcol; j >= fcol ; j--) {
                 ans.add(arr[lrow][j]);
                 lrow --;
                if(frow > lrow || fcol > lcol) break;
            }
            for (int i = lrow; i >= frow ; i--) {
                ans.add(arr[i][fcol]);
                fcol ++ ;
            }
        }
        return ans;
        }
}
