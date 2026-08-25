package Arrays;

public class ShallowArrays {
    static void main(String[] args) {
        int [] arr ={2,3,4,5,56,56,67,47};
        int [] x = arr; //x is a shallow copy of array
         x [0] = 100;
        System.out.println(x [0]);
    }
}
