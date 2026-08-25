package ArrayList1D;

import java.util.Vector;

public class AddOne {
    static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9};
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 0;
        for (int i = n - 1; i >= 0 ; i --) {
            if(arr[i] + carry <= 9){
             ans.add(arr[i] + carry);
             carry = 0;
            }else{
                ans.add(0);
                carry = 1;
            }
            //Collections.reverse();
            for(int ele : arr){
                System.out.print(ele + " ");
            }
        }
    }
}
