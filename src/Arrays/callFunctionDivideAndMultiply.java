package Arrays;


public class callFunctionDivideAndMultiply {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 66, 7, 8, 9};
        print(arr);     //print orginal value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {   //odd
                arr[i] *= 2;
            } else {                 //even
                arr[i] += 10;
            }
        }
            print(arr);
        }
         public static void print(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +" ");
            }
             System.out.println();
        }
    }
