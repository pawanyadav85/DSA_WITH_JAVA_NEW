package Arrays;

public class SecondMaximum {
    static void main(String[] args) {
        int [] arr = {1,4,5,6,7,8,8,4,6,7,5,6,7};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        //  first largest element
        for (int i = 0; i < n ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            //second largest element
            for (int i = 0; i < n; i++) {
                if (arr[i] > Smax && arr[i] != max) {
                    Smax = arr[i];
                }
            }
            System.out.println(max);
            System.out.println(Smax);

    }
}
