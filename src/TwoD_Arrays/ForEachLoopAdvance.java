package TwoD_Arrays;

public class ForEachLoopAdvance {
    static void main(String[] args) {
        int[][] arr = {{1,2,6,4} , {4,5,6,7} , {7,8,9,0}};
        for(int [] a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
