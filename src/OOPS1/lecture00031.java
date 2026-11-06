package OOPS1;

public class lecture00031 {
    static void change(int[] x ){
         x[0] = 100;
    }
    static void main()
    {

       int arr[] = {23,33,54,5,6,50};
       change(arr);
        System.out.println("Chanage value after print " + arr[0]);
    }
}
